""" Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words.
Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Example 4:
Input: s = "  Bob    Loves  Alice   "
Output: "Alice Loves Bob"

Example 5:
Input: s = "Alice does not even like bob"
Output: "bob like even not does Alice"

Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
"""

from typing import List

from z3 import *

from theory.Theory import Theory


class MainTheory(Theory):
    def __init__(self):
        self.s, self.sep, self.result, xs, ys = Strings('s sep result xs ys')
        fi, li = Ints('fi li')

        split = RecFunction('split', StringSort(), StringSort(), SeqSort(StringSort()))
        RecAddDefinition(split, [xs, re],
                         If(Length(xs) == 0, Empty(StringSort()),
                            If(IndexOf(allow_chars, Unit(xs[0])) >= 0,
                               Concat(Unit(xs[0]), filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars)),
                               filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars))))

    def domain(self) -> List[ExprRef]:
        return [self.s]

    def range(self) -> List[ExprRef]:
        return [self.result]

    def formula(self) -> BoolRef:
        return self.f


theory = MainTheory()
for solution in theory(result=8):
    print(solution)
