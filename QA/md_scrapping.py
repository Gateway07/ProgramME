#!/usr/bin/env python3
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


def extract_sections(html_path: str):
    """
    Parse the HTML, iterate each <section> child in order,
    flatten tables inline into Feature|Plan|Value triples,
    and build a JSON list without changing the original order.
    """
    raw = open(html_path, encoding='utf-8').read()
    soup = BeautifulSoup(raw, 'html.parser')
    entries = []

    for sec in soup.find_all('section'):
        # 1. Determine slug and feature fallback header
        heading = sec.find(['h2', 'h3', 'h4'])
        heading_text = heading.get_text(strip=True) if heading else ''
        slug = f"{'#' * (2 if heading.name == 'h2' else 3)} {heading_text}" if heading else ''

        lines = []
        for node in sec.children:
            # a) Text nodes
            if isinstance(node, NavigableString):
                txt = node.strip()
                if txt:
                    lines.append(txt)
                continue
            # 1) Skip nested <section> tags entirely
            if isinstance(node, Tag) and node.name == 'section':
                continue

            # 2) Real HTML tables
            if isinstance(node, Tag) and node.name == 'table':
                # Extract headers, joining multi-line header cells with ' / '
                header_cells = node.find_all('th')
                headers = [
                    th.get_text(separator=' / ', strip=True)
                    for th in header_cells
                ]
                # If first header blank, use section heading as Feature label
                key_header = headers[0] or heading_text
                # Emit header triple only if meaningful
                lines.append(f"{key_header} | Name | Value")

                # Process each data row
                for tr in node.find_all('tr')[1:]:
                    cells = tr.find_all(['td', 'th'])
                    first = cells[0].get_text(strip=True) if cells else ''
                    if not first:  # skip blank‑label rows (images/spacers)
                        continue

                    for idx, cell in enumerate(cells[1:], start=1):
                        plan = headers[idx]
                        # Extract cell text, normalize check/dash
                        val = cell.get_text(separator=' ', strip=True)
                        if '✔' in val:
                            val = 'Yes'
                        elif val in ('-', '—', '–'):
                            val = 'No'
                        # If <details> present, capture summary + list items
                        details = cell.find('details')
                        if details:
                            summary = details.find('summary').get_text(strip=True) if details.find('summary') else ''
                            items = [li.get_text(strip=True) for li in details.find_all('li')]
                            note = f"{summary} ({'; '.join(items)})" if items else summary
                            val = note or val
                        # If an <a> link exists, append its text in brackets
                        a = cell.find('a')
                        if a:
                            link_text = a.get_text(strip=True)
                            val = f"{val} [{link_text}]"

                        lines.append(f"{first} | {plan} | {val}")
                continue

            # c) Other tags (headings, paragraphs, lists)
            if isinstance(node, Tag):
                txt = node.get_text(separator='\n', strip=True)
                if txt:
                    lines.append(txt)

        # Combine blocks, preserving interleaving
        full_text = "\n\n".join(lines).strip()
        if slug and full_text:
            entries.append({"url": slug, "text": full_text})

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
