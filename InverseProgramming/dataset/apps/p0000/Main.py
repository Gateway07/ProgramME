"""  Accordion represented as a concatenation of: an opening bracket [, a colon :, some (possibly zero) vertical line characters |,
another colon, and a closing bracket ]. The length of the accordion is the number of characters in it.
For example, [::], [:||:] and [:|||:] are accordions having length $4$, $6$ and $7$. (:|:), {:||:}, [:], ]:||:[ are not accordions.
You are given a string $s$. You want to transform it into an accordion by removing some (possibly zero) characters from it.
Note that you may not insert new characters or reorder existing ones. Is it possible to obtain an accordion by removing characters
from $s$, and if so, what is the maximum possible length of the result?
"""
from z3 import *

filter = RecFunction('filter', StringSort(), StringSort(), StringSort())
xs, ys, x, allow_chars = Strings('xs ys x allow_chars')
fi, li, result = Ints('fi li result')


def tail(xs: SeqRef) -> ExprRef:
    return SubSeq(xs, 1, Length(xs) - 1)


RecAddDefinition(filter, [xs, allow_chars],
                 If(Length(xs) == 0, Empty(StringSort()),
                    If(IndexOf(allow_chars, Unit(xs[0])) >= 0,
                       Concat(Unit(xs[0]), filter(tail(xs), allow_chars)), filter(tail(xs), allow_chars))))

f = And(
    fi == IndexOf(x, "["),
    li == LastIndexOf(x, "]"),
    ys == If(Or(fi < 0, li < 0, fi > li), "",
             filter(SubString(x, fi + 1, li - fi), StringVal("|:"))),
    result == If(Or(Length(ys) == 0, ys[0] != CharVal(':'), ys[Length(ys) - 1] != CharVal(':')), -1,
                 Length(filter(SubString(ys, 1, Length(ys) - 1), StringVal("|"))) + 4))

s = Solver()
s.add(f)
print(s.sexpr())

s.add(x == StringVal(":[[2:34:::1..]"))
res = s.check()
print(res)
if res == sat:
    m = s.model()
    print(m[result], m[ys], m[fi], m[li])
