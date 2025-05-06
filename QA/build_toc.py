import json
import re
from pathlib import Path
from typing import Dict, List


def augment_dictionary(toc: Dict[str, List[str]]) -> Dict[str, List]:
    zip_toc = {}
    for k, v in toc.items():
        if len(v) == 0:
            continue
        k = k.replace('-', ' ').replace('_', ' ')
        zip_toc[k] = [re.sub(r'(?<! )-|-(?! )', ' ', s.replace('---', '-').replace('--', '/')) for s in v if len(s.split('-')) > 1]
    return zip_toc


def unfold(sections, path):
    items = []
    for sec in sections:
        sec["path"] = path
        items.append(sec)
        # Recurse into any nested list
        nested = sec.get("nested", [])
        if nested:
            items.extend(unfold(nested, path))
    return items


output_dir = Path("./docs")


def main():
    table, all_sections = {}, []
    toc_file = Path(output_dir, "toc.json")
    sec_file = Path(output_dir, "sections.json")
    toc_file.unlink(missing_ok=True)
    sec_file.unlink(missing_ok=True)
    for path in output_dir.rglob('*.json'):
        if not path.is_file():
            continue

        sections = json.loads(path.read_text(encoding="utf-8"))

        path = f'{path.relative_to(output_dir).with_suffix('')}'
        path = path.replace("\\", "/")
        
        urls = table.get(path, [])
        urls.extend([s.get("url") for s in unfold(sections, path)])
        table[path] = urls

        all_sections.extend(sections)

    with open(toc_file, 'w', encoding='utf-8') as f:
        json.dump(table, f, ensure_ascii=False, indent=2)
    with open(sec_file, 'w', encoding='utf-8') as f:
        json.dump(all_sections, f, ensure_ascii=False, indent=2)

    print(augment_dictionary(table))


if __name__ == '__main__':
    main()
