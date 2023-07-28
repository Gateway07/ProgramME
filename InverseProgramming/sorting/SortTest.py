from unittest import TestCase, main

from z3.Z3Util import get_models, gen_smt

from SortAlg import *


def _to_check(vec: List, in_vec):
    if isinstance(in_vec, list):
        return And([in_vec[j] == vec[j] for j in range(len(vec))])
    if isinstance(in_vec, SeqRef):
        return in_vec == Concat(*[Unit(IntVal(v)) for v in vec])
    raise AssertionError("Wrong type: " + type(in_vec))


class SortTest(TestCase):
    def setUp(self):
        self.functions = [sort_merge, sort_bubble, sort_dot, sort_index, sort_seq]

    def tearDown(self):
        pass

    def _sorting(self, i):
        vec = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, -6, 5, 4, 3, 2, 1, 23, 43, 11, 1]
        n = len(vec)
        f, in_vec, out_vec = self.functions[i](n)

        s = Solver()
        s.add(And(f, _to_check(vec, in_vec)))
        for m in gen_smt(s, [out_vec] if isinstance(in_vec, SeqRef) else out_vec):
            self.assertEqual([m.eval(out_vec[j]) for j in range(n)], sorted(vec))

    def test_merge(self):
        self._sorting(0)

    def test_bubble(self):
        self._sorting(1)

    def test_dot(self):
        self._sorting(2)

    def test_index(self):
        self._sorting(3)

    def test_seq(self):
        self._sorting(4)

    def _equality(self, k, l):
        n = 5
        fs1, in_vec1, out_vec1 = self.functions[k](n)
        fs2, in_vec2, out_vec2 = self.functions[l](n)
        not_eq = [out_vec1[j] != out_vec2[j] for j in range(n)]
        for m in get_models(And(fs1, fs2, And([in_vec1[j] == in_vec2[j] for j in range(n)]), Or(not_eq)), []):
            self.assertFalse(True, 'There is counterexample: {} which returning for {}: {} and for {}: {}'.format(
                " ".join(str(m.eval(in_vec1[j])) for j in range(n)),
                str(self.functions[k]),
                " ".join(str(m.eval(out_vec1[j])) for j in range(n)),
                str(self.functions[l]),
                " ".join(str(m.eval(out_vec2[j])) for j in range(n))))
        else:
            pass

    def test_equality(self):
        self._equality(0, 1)
        self._equality(0, 2)
        self._equality(0, 3)
        self._equality(1, 2)
        self._equality(1, 3)
        self._equality(2, 3)


if __name__ == '__main__':
    main()
