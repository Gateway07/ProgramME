# !/usr/bin/env python3
import argparse
import json
import re
import subprocess
import tempfile

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


def extract_sections(html_path: str):
    raw = open(html_path, encoding='utf-8').read()
    soup = BeautifulSoup(raw, 'html.parser')
    entries = []

    for sec in soup.find_all('section'):
        # Build slug from first heading
        heading = sec.find(['h2', 'h3', 'h4'])

        section_id = sec.get('id') or (heading.get('id') if heading else '')
        lines = []
        for node in sec.children:
            # Skip nested sections
            if isinstance(node, Tag) and node.name == 'section':
                continue

            # Text node
            if isinstance(node, NavigableString):
                txt = node.strip()
                if txt:
                    lines.append(txt)
                continue

            # HTML tables
            if isinstance(node, Tag) and node.name == 'table':
                # headers
                ths = node.find_all('th')
                headers = [th.get_text(separator=' / ', strip=True) for th in ths]
                key = headers[0]
                lines.append(f"{key} | Name | Value")

                for tr in node.find_all('tr')[1:]:
                    cells = tr.find_all(['td', 'th'])
                    first = cells[0].get_text(strip=True) if cells else ''
                    if not first:
                        continue
                    for idx, cell in enumerate(cells[1:], start=1):
                        plan = headers[idx]
                        raw_val = serialize_node(cell).strip()
                        # normalize
                        if '✔' in raw_val:
                            val = 'Yes'
                        elif raw_val.strip() in ('-', '—', '–'):
                            val = 'No'
                        else:
                            val = raw_val
                        lines.append(f"{first} | {plan} | {val}")
                continue

            # All other tags (headings, p, ul, etc.)
            if isinstance(node, Tag):
                txt = serialize_node(node).strip()
                if txt:
                    lines.append(txt)

        full = "\n\n".join(lines).strip()
        if section_id and full:
            entries.append({"url": f"#{section_id}", "text": full})

    return entries


def main():
    p = argparse.ArgumentParser()
    p.add_argument('source', help="Source .md/.mdx")
    p.add_argument('output', help="Output JSON file")
    args = p.parse_args()

    prepped = preprocess(args.source)
    source_path = sectionize_with_node(prepped)
    data = extract_sections(source_path)
    with open(args.output, 'w', encoding='utf-8') as f:
        json.dump(data, f, ensure_ascii=False, indent=2)
    print(f"Wrote {len(data)} sections to {args.output}")


if __name__ == '__main__':
    main()
