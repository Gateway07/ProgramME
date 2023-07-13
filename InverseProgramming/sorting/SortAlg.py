from typing import List

from z3 import *


def sort_dot(n: int, in_vec: List = None) -> (BoolRef, List, List):
    """ Define constraints for array's sorting based on idea that [I] * [M] = [O], where I - input vector, M -
    permutation matrix with 0 and 1, O - output sorted vector, * - dot vector's operation. """
    if in_vec == None:
        in_vec = [Int('x{}'.format(i)) for i in range(n)]

    matrix = []
    for row in range(n):
        # A for loop for column entries
        matrix.append([Bool('{}_{}'.format(col, row)) for col in range(n)])
    f = []
    for i in range(n):
        l1 = [(row, 1) for row in matrix[i]]
        l2 = [(col[i], 1) for col in matrix]
        f.append(And(PbEq(l1, 1), PbEq(l2, 1)))

    out_vec = []
    for i in range(n):
        s = [If(matrix[i][j], in_vec[j], 0) for j in range(n)]
        out_vec.append(Sum(s))

    for i in range(n - 1):
        f.append(out_vec[i] <= out_vec[i + 1])

    return And(f), in_vec, out_vec


def sort_bubble(n: int, in_vec: List = None) -> (BoolRef, List, List):
    """ Define constraints for array's sorting based on classical bubble sort.  """

    def up(arr):
        fs = []
        for i in range(len(arr) - 1):
            x = arr[i]
            y = arr[i + 1]
            # compare and swap x and y
            x1, y1 = FreshInt(), FreshInt()

            c = If(x <= y, And(x1 == x, y1 == y), And(x1 == y, y1 == x))
            # store values
            arr[i] = x1
            arr[i + 1] = y1
            fs.append(c)
        return fs

    if in_vec == None:
        in_vec = [Int('x{}'.format(i)) for i in range(n)]

    fs = []  # list of assertions to be returned
    # recursive call to bubble_up
    out_vec = in_vec.copy()
    for _ in range(n):
        cst = up(out_vec)
        fs.extend(cst)
    return And(fs), in_vec, out_vec


def sort_merge(n: int, in_vec: List = None) -> (BoolRef, List, List):
    """ Define constraints for array's sorting based on classical sort by merging.  """

    def cmp2(x, y):
        l, g = FreshInt(), FreshInt()
        return [If(x <= y, And(l == x, g == y), And(l == y, g == x))], [l, g]

    def cmp3(x, y, z) -> (List, List):
        f1, (l0, g0) = cmp2(x, y)
        f2, (l1, g1) = cmp2(g0, z)
        f3, (l2, g2) = cmp2(l0, l1)
        return [f1[0], f2[0], f3[0]], [l2, g2, g1]

    def merge(xs: List, ys: List) -> (List, List):
        assert len(xs) == len(ys) or len(xs) == len(ys) - 1

        fs, lower_vars, greater_vars, ls0, gs0 = [], [], [], xs.copy(), ys.copy()
        while len(ls0) > 0:
            ls1, gs1 = [], []
            for i in range(len(ls0)):
                f, (l, g) = cmp2(ls0[i], gs0[i])
                fs.extend(f)
                ls1.append(l)
                gs1.append(g)

            n1, n2 = len(ls0), len(gs0)
            ls0 = ls1[1:]
            if n1 == n2 - 1:
                ls0.append(gs0[n2 - 1])
                gs0 = gs1
            else:
                greater_vars.append(gs1[-1])
                gs0 = gs1[:-1]
            lower_vars.append(ls1[0])

        assert len(lower_vars) + len(greater_vars) == len(xs) + len(ys)
        lower_vars.extend(reversed(greater_vars))
        return fs, lower_vars

    def split(xs: List) -> (List, List):
        n = len(xs)
        assert n > 1
        if n == 2:
            return cmp2(xs[0], xs[1])
        elif n == 3:
            return cmp3(xs[0], xs[1], xs[2])

        m = int(n / 2)
        f1, left = split(xs[:m])
        f2, right = split(xs[m:])
        f3, out_list = merge(left, right)
        assert len(out_list) == n

        fs = []
        fs.extend(f1)
        fs.extend(f2)
        fs.extend(f3)

        return fs, out_list

    if in_vec == None:
        in_vec = [Int('{}'.format(i)) for i in range(n)]

    fs, out_vec = split(in_vec)
    fs.extend([out_vec[i] <= out_vec[i + 1] for i in range(n - 1)])
    return And(fs), in_vec, out_vec


def sort_index(n: int, in_vec: List = None) -> (BoolRef, List, List):
    """ Define constraints for array's sorting based on invariant that sorting value as index and its counts
    are the same before and after sorting!
    """
    if in_vec == None:
        in_vec = [FreshInt() for _ in range(n)]
    in_counts = K(IntSort(), 0)
    for v in in_vec:
        in_counts = Store(in_counts, v, in_counts[v] + 1)

    out_vec = [FreshInt() for _ in range(n)]
    out_counts = K(IntSort(), 0)
    for v in out_vec:
        out_counts = Store(out_counts, v, out_counts[v] + 1)

    fs = []
    for i in range(n - 1):
        fs.append(out_vec[i] <= out_vec[i + 1])

    for e in out_vec:
        fs.append(in_counts[e] == out_counts[e])
    return And(fs), in_vec, out_vec


def sort_seq(n: int) -> (ExprRef, SeqRef, SeqRef):
    def cmp2(x: ArithRef, y: ArithRef) -> ExprRef:
        return If(x <= y, Concat(Unit(x), Unit(y)), Concat(Unit(y), Unit(x)))

    def tail(xs: SeqRef) -> ExprRef:
        return SubSeq(xs, 1, Length(xs) - 1)

    seq_sort = SeqSort(IntSort())

    x, l, r = Ints('x l r')
    in_seq, out_seq, ls, rs, xs, ys = Consts('in out left right xs ys', seq_sort)
    split_fun = RecFunction('split', seq_sort, seq_sort)
    merge_fun = RecFunction('merge', IntSort(), seq_sort, IntSort(), seq_sort, seq_sort)

    def merge(xs: SeqRef, ys: SeqRef):
        return merge_fun(xs[0], tail(xs), ys[0], tail(ys))

    RecAddDefinition(split_fun, [in_seq],
                     If(Or(Length(in_seq) == 0, Length(in_seq) == 1), in_seq,
                        If(Length(in_seq) == 2, cmp2(in_seq[0], in_seq[1]),
                           merge(split_fun(SubSeq(in_seq, 0, Length(in_seq) / 2)),
                                 split_fun(SubSeq(in_seq, Length(in_seq) / 2, Length(in_seq) - (Length(in_seq) / 2))))
                           )))

    RecAddDefinition(merge_fun, [l, ls, r, rs],
                     If(And(Length(ls) == 0, Length(rs) == 0), cmp2(l, r),
                        If(Length(ls) == 0, If(l <= r, Concat(Unit(l), Unit(r), rs), Concat(Unit(r), merge_fun(rs[0], tail(rs), l, ls))),
                           If(Length(rs) == 0, If(r <= l, Concat(Unit(r), Unit(l), ls), Concat(Unit(l), merge_fun(ls[0], tail(ls), r, rs))),
                              If(l <= r,
                                 Concat(Unit(l), merge_fun(ls[0], tail(ls), r, rs)),
                                 Concat(Unit(r), merge_fun(l, ls, rs[0], tail(rs))))))))

    return out_seq == split_fun(in_seq), in_seq, out_seq
