import json
from typing import (Dict)

def add(key: str, map: Dict):
    if key.isnumeric():
        return
    map[key] = map.get(key, 0) + 1

def print_map(map: Dict):
    print(len(map))
    for k, v in sorted(map.items(), key=lambda item: item[1]):
        print(k, v)

if __name__ == "__main__":
    dict = {}
    with open('vocab.json', encoding="utf8") as f_in:
        dict = json.load(f_in)

    print(len(dict))
    grams = {}
    for e in sorted(dict.keys()):
        if e.isnumeric():
            continue
        for i in range(len(e) - 2):
            add(e[i:i + 2], grams)

    print_map(grams)
