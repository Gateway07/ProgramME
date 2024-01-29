def is_ge(a: list[int], n: int) -> bool:
    '''
    pre: len(a) > 0
    pre: n > 0
    post: __return__
    '''
    if a is None or len(a) != n:
        return False

    for i in a:
        if not i >= 0:
            return False
    return True
