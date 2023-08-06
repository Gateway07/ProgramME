def main(s):
    if s.count('[') == 0 or s.count(']') == 0:
        return -1

    t = s[s.find('['):s.rfind(']') + 1]
    if t.count(':') < 2:
        return -1

    t = t[t.find(':'):t.rfind(':') + 1]
    return 4 + t.count('|')
