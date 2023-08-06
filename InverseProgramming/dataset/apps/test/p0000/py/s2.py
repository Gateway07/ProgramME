def main(s):
    if '[' in s:
        s = s[s.find('[') + 1:]
        if ']' in s:
            s = s[:s.rfind(']')]
            if s.count(':') >= 2:
                s = s[s.find(':') + 1: s.rfind(':')]
                return s.count('|') + 4

            else:
                return -1
        else:
            return -1

    return -1

print(main('[::|Python|::]'))
