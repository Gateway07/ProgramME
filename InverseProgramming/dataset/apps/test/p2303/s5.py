def main(s: str) -> str:
    curr_word = ""
    ans = []

    for char in s:
        if char == ' ':
            if curr_word != "":  # if it is a newly separately word
                ans.append(curr_word)
                curr_word = ""
        else:
            curr_word += char

    if curr_word != "":
        ans.append(curr_word)

    return " ".join(ans[::-1])
