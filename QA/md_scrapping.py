# !/usr/bin/env python3
import argparse
import json
import re
import shutil
import subprocess
import tempfile
from pathlib import Path
from typing import List, Dict

from bs4 import BeautifulSoup, NavigableString, Tag


def preprocess(src: str) -> str:
    """
    1. Remove all <!-- … --> comment blocks (multi-line too).
    2. Strip out any MDX import/export or standalone JSX tags.
    """
    text = open(src, encoding='utf-8').read()

    # 1) Remove HTML comments (including multi-line)
    no_comments = re.sub(r'<!--[\s\S]*?-->', '', text)

    # 2) Remove MDX imports/exports or any standalone JSX-like tags
    cleaned = re.sub(r'^\s*(?:import\b|export\b|<[^>]+>).*$', '', no_comments, flags=re.MULTILINE)

    # Write cleaned markdown to a temp file for further processing
    tmp = tempfile.NamedTemporaryFile('w', suffix='.md', delete=False, encoding='utf-8')
    tmp.write(cleaned)
    tmp.close()
    return tmp.name


def sectionize_with_node(md_path: str) -> str:
    """Run the Node helper to produce HTML with <section id="…"> wrappers."""
    out_path = "section.html"

    subprocess.run(['node', 'sectionize.mjs', md_path, out_path], check=True)
    return out_path


def serialize_node(node) -> str:
    """
    Recursively walk a BeautifulSoup node, emitting:
      - raw text for NavigableString,
      - '[text](href)' for <a href="...">text</a>,
      - recursing into other Tags.
    """
    parts = []
    for child in node.children:
        if isinstance(child, NavigableString):
            parts.append(str(child))
        elif isinstance(child, Tag):
            if child.name == 'a' and child.has_attr('href'):
                text = child.get_text(strip=True)
                href = child['href']
                parts.append(f"[{text}]({href})")
            else:
                parts.append(serialize_node(child))
    return ''.join(parts)


def process_section(sec: Tag) -> dict:
    """
    Build a dict for one <section>:
      - url: '#'+id attribute of the section
      - text: flattened content from immediate children
      - nested: list of child sections (recursively)
    """
    # 1) Grab the section's own id (fallback to heading id)
    heading = sec.find(['h2', 'h3', 'h4'])
    section_id = sec.get('id') or (heading.get('id') if heading else '')

    # 2) Flatten immediate children (skip nested <section>)
    lines = []
    for node in sec.children:
        if isinstance(node, Tag) and node.name == 'section':
            continue

        if isinstance(node, NavigableString):
            txt = node.strip()
            if txt:
                lines.append(txt)
            continue

        # HTML tables
        if isinstance(node, Tag) and node.name == 'table':
            ths = node.find_all('th')
            headers = [th.get_text(separator=' / ', strip=True) for th in ths]
            key = headers[0] if headers else ''
            lines.append(f"{key} | Name | Value")

            for tr in node.find_all('tr')[1:]:
                cells = tr.find_all(['td', 'th'])
                first = cells[0].get_text(strip=True) if cells else ''
                if not first:
                    continue
                for idx, cell in enumerate(cells[1:], start=1):
                    plan = headers[idx]
                    raw_val = serialize_node(cell).strip()
                    if '✔' in raw_val:
                        val = 'Yes'
                    elif raw_val.strip() in ('-', '—', '–'):
                        val = 'No'
                    else:
                        val = raw_val
                    lines.append(f"{first} | {plan} | {val}")
            continue

        # All other tags
        if isinstance(node, Tag):
            txt = serialize_node(node).strip()
            if txt:
                lines.append(txt)

    full = "\n".join(lines).strip()

    # 3) Recurse into direct child <section> nodes
    nested = []
    for child in sec.find_all('section', recursive=False):
        nested.append(process_section(child))

    return {"url": section_id, "text": full, "nested": nested}


def extract_sections(html_path: str) -> list[dict]:
    """
    Parse the HTML, find only top-level <section> tags,
    and return a list of nested section dicts.
    """
    raw = open(html_path, encoding='utf-8').read()
    soup = BeautifulSoup(raw, 'html.parser')

    # Only root sections (no section parent)
    top_secs = [
        sec for sec in soup.find_all('section')
        if sec.find_parent('section') is None
    ]
    return [process_section(sec) for sec in top_secs]


def process(src_path, dest_path):
    prepped = preprocess(src_path)
    html_path = sectionize_with_node(prepped)
    data = extract_sections(html_path)
    with open(dest_path, 'w', encoding='utf-8') as f:
        json.dump(data, f, ensure_ascii=False, indent=2)
    print(f"Wrote {len(data)} top-level sections to {dest_path}")


def unfold(sections):
    items = []
    for sec in sections:
        items.append(sec)
        # Recurse into any nested list
        nested = sec.get("nested", [])
        if nested:
            items.extend(unfold(nested))
    return items


def categorize(toc: Dict[str, List[str]]) -> Dict[str, List]:
    zip_toc = {}
    for k, v in toc.items():
        if len(v) == 0:
            continue
        k = k.replace('-', ' ').replace('_', ' ')
        zip_toc[k] = [re.sub(r'(?<! )-|-(?! )', ' ', s.replace('---', '-').replace('--', '/')) for s in v if len(s.split('-')) > 1]
    return zip_toc


def main():
    p = argparse.ArgumentParser()
    p.add_argument('source', help="Source MD directory")
    p.add_argument('output', help="Output JSON directory")
    args = p.parse_args()

    input_dir = Path(args.source)
    output_dir = Path(args.output)
    shutil.rmtree(output_dir, ignore_errors=True)
    for src_path in input_dir.rglob('*.md'):
        if src_path.is_file():
            # Compute the relative path from input_dir,
            # then append that to output_dir
            rel_path = src_path.relative_to(input_dir)
            dest_path = output_dir / rel_path

            # Make sure the destination subdirectory exists
            dest_path.parent.mkdir(parents=True, exist_ok=True)

            process(src_path, dest_path.with_suffix('.json'))
            print(f"Processed {src_path} -> {dest_path}")

    table = {}
    toc = Path(output_dir, "toc.json")
    toc.unlink(missing_ok=True)
    for path in output_dir.rglob('*.json'):
        if not path.is_file():
            continue

        sections = json.loads(path.read_text(encoding="utf-8"))
        path = f'{path.relative_to(output_dir).with_suffix('')}'
        path = path.replace("\\", "/")

        urls = table.get(path, [])
        urls.extend([s.get("url") for s in unfold(sections)])
        table[path] = urls

    with open(toc, 'w', encoding='utf-8') as f:
        json.dump(table, f, ensure_ascii=False, indent=2)

    print(categorize(table))


if __name__ == '__main__':
    main()
