from unittest import TestCase, main

from SortAlg import *
from Z3Util import get_models


class SortTest(TestCase):
    def setUp(self):
        self.functions = [sort_merge, sort_bubble, sort_dot, sort_index]

    def tearDown(self):
        pass

    def _sorting(self, i):
        vec = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, -6, 5, 4, 3, 2, 1, 23, 43, 11, 1]
        n = len(vec)
        fs, in_vec, out_vec = self.functions[i](n)

        check = [And(in_vec[j] == vec[j]) for j in range(n)]
        for m in get_models(And(fs, And(check)), out_vec):
            self.assertEqual([m.eval(out_vec[j]) for j in range(n)], sorted(vec))

    def test_merge(self):
        self._sorting(0)

    def test_bubble(self):
        self._sorting(1)

    def test_dot(self):
        self._sorting(2)

    def test_index(self):
        self._sorting(3)

    def _equality(self, k, l):
        n = 5
        fs1, in_vec, out_vec1 = self.functions[k](n)
        fs2, _, out_vec2 = self.functions[l](n, in_vec)
        eq = [out_vec1[j] != out_vec2[j] for j in range(n)]
        for _ in get_models(And(fs1, fs2, Or(eq)), []):
            self.assertFalse(True, 'There is counterexample!')
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
