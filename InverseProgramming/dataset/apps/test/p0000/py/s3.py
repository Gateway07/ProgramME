def main(s):
    st = s.find('[')
    if st == -1:
        return -1
    s = s[st + 1:]

    st = s.find(':')
    if st == -1: return -1
    s = s[st + 1:]

    s = s[::-1]
    st = s.find(']')
    if st == -1:
        return -1
    s = s[st + 1:]

    st = s.find(':')
    if st == -1:
        return -1
    s = s[st + 1:]
    x = s.count('|')
    return x + 4 if x >= 0 else -1
