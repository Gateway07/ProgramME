def main(s):
    brackets_balanced = lambda s: s.count('[') != 0 and s.count(']') != 0
    colons_enough = lambda t: t.count(':') >= 2
    count_pipes = lambda t: t.count('|')

    if not brackets_balanced(s):
        return -1

    t = s[s.find('['):s.rfind(']') + 1]

    if not colons_enough(t):
        return -1

    t = t[t.find(':'):t.rfind(':') + 1]
    return 4 + count_pipes(t)
