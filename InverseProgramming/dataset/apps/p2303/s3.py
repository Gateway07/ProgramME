def main(s: str) -> str:
    s = s.strip().split()
    l = []
    for i in reversed(range(len(s))):
        l.append(s[i])
    return ' '.join(l)
