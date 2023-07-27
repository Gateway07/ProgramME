from random import random, randint

from z3 import *


def combine_bv(self, a: BitVecNumRef, b: BitVecNumRef, c: BitVecNumRef) -> BitVecVal:
    val_a = a.as_string()
    val_b = b.as_string()
    val_c = c.as_string()
    num = ""
    for i in range(len(val_a)):
        _a = self.hex(val_a[i])
        _b = self.hex(val_b[i])
        _c = self.hex(val_c[i])
        r = _a ^ ((_a ^ _b) | (_a ^ _c))
        if r <= 9:
            n = ord('0') + r
        else:
            n = ord('a') + r - 10
        num += chr(n)
    return BitVecVal(num, a.size(), self.c)


def combine_bool(self, a: BoolRef, b: BoolRef, c: BoolRef) -> BoolVal:
    val_a = a.__bool__()
    val_b = b.__bool__()
    val_c = c.__bool__()

    _a = 1 if val_a else 0
    _b = 1 if val_b else 0
    _c = 1 if val_c else 0
    r = _a ^ ((_a ^ _b) | (_a ^ _c))

    return BoolVal(False if r == 0 else True, self.c)


@staticmethod
def hex(c: str) -> int:
    if '0' <= c[0] <= '9':
        return ord(c[0]) - ord('0')
    if 'a' <= c[0] <= 'f':
        return 10 + ord(c[0]) - ord('a')
    raise Exception("Invalid hex:" + c)


def add_constraints(self, exp: ExprRef, val: ExprRef):
    s = val.sort_kind()
    if s == Z3_BV_SORT:
        size = val.sort().bv_size()
        for i in range(size):
            r = Extract(i, i, exp)
            r = r.simplify()
            ast: BoolRef = Extract(i, i, exp) == r
            self.constraints.append(ast)

    elif s == Z3_BOOL_SORT:
        self.constraints.append(exp == val)
    else:
        raise AssertionError("Invalid sort: " + exp.__str__())


def mutate(self, mutations: List):
    a_sample = self.values()

    sigma = mutations.copy()
    for k in range(2, 6):
        new_sigma = []
        all_count, valid_count = 0, 0
        for b_sample in sigma:
            for c_sample in mutations:
                candidate = self.mutate_samples(a_sample, b_sample, c_sample)

                if candidate not in mutations:
                    valid = self.check(candidate)
                    all_count += 1
                    if valid:
                        valid_count += 1
                        new_sigma.append(candidate)
                    mutations.add(candidate)

        accuracy = valid_count / all_count
        print("Valid: ", valid_count, "/", all_count, "=", accuracy)

        if all_count == 0 or accuracy < 0.1:
            break
        sigma = new_sigma


def generate_pred(self, p):
    if random() <= p:
        p -= 0.2

        r = randint(0, 7)
        if r == 0:
            return self.generate_pred(p) and self.generate_pred(p)
        elif r == 1:
            return self.generate_pred(p) or self.generate_pred(p)
        elif r == 2:
            return not self.generate_pred(p)
        elif r == 3:
            return Z3_mk_bvult(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 4:
            return Z3_mk_bvule(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 5:
            return self.generate_bv(p) < self.generate_bv(p)
        elif r == 6:
            return self.generate_bv(p) <= self.generate_bv(p)
        elif r == 7:
            return self.generate_bv(p) == self.generate_bv(p)
        else:
            raise Exception("Abort")

    size = len(self.preds_map[0])
    a = randint(0, size + 1)
    if a == size:
        return self.bool_val(randint(0, 1))

    return self.preds_map[0][a]


def generate_random_predicates(self):
    self.common_bv_size = 1
    max_value = 0
    for k, l in self.preds_map:
        if k and len(l) > max_value:
            self.common_bv_size = k
            max_value = len(l)

    self.random_preds.clear()
    for i in range(randint(16, 32)):
        self.random_preds.append(self.generate_pred(1.0))


def generate_bv(self, p: float):
    if random() <= p:
        p -= 0.2

        r = randint(0, 14)
        if r == 0:
            return ~self.generate_bv(p)
        elif r == 1:
            return -self.generate_bv(p)
        elif r == 2:
            return self.generate_bv(p) & self.generate_bv(p)
        elif r == 3:
            return self.generate_bv(p) | self.generate_bv(p)
        elif r == 4:
            return self.generate_bv(p) + self.generate_bv(p)
        elif r == 5:
            return self.generate_bv(p) - self.generate_bv(p)
        elif r == 6:
            return self.generate_bv(p) * self.generate_bv(p)
        elif r == 7:
            return Z3_mk_bvudiv(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 8:
            return Z3_mk_bvurem(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 9:
            return self.generate_bv(p) / self.generate_bv(p)
        elif r == 10:
            return Z3_mk_bvsrem(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 11:
            return Z3_mk_bvsmod(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 12:
            return Z3_mk_bvshl(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 13:
            return Z3_mk_bvlshr(self.c, self.generate_bv(p), self.generate_bv(p))
        elif r == 14:
            return Z3_mk_bvashr(self.c, self.generate_bv(p), self.generate_bv(p))
        else:
            raise Exception("Abort")

    size = len(self.preds_map[self.common_bv_size])
    a = randint(0, size)
    if a == size:
        return self.bv_val(0, self.common_bv_size)

    return self.preds_map[self.common_bv_size][a]
