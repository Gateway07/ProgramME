import unittest

# Import the main function here (assuming it's in the same file for testing)
# from your_module import main
from s0 import main

class TestMainFunction(unittest.TestCase):

    def test_small_graph(self):
        n = 4
        m = 5
        a = 1
        b = 5
        roads = [(1, 2, 1), (2, 3, 3), (3, 4, 5), (1, 3, 2), (2, 4, 4)]
        expected_result = [0, 1, 2, 5]
        self.assertEqual(main(n, m, a, b, roads), expected_result)

    def test_large_graph(self):
        n = 6
        m = 8
        a = 2
        b = 10
        roads = [(1, 2, 2), (1, 3, 5), (2, 3, 3), (2, 4, 7), (3, 5, 9), (4, 5, 3), (4, 6, 6), (5, 6, 2)]
        expected_result = [0, 2, 3, 9, 6, 8]
        self.assertEqual(main(n, m, a, b, roads), expected_result)

    def test_graph_with_useless_roads(self):
        n = 5
        m = 6
        a = 1
        b = 3
        roads = [(1, 2, 1), (1, 3, 2), (2, 4, 3), (3, 4, 4), (4, 5, 3), (2, 5, 3)]
        expected_result = [0, 1, 2, 2, 5]
        self.assertEqual(main(n, m, a, b, roads), expected_result)

    def test_graph_with_small_components(self):
        n = 8
        m = 9
        a = 1
        b = 4
        roads = [(1, 2, 1), (2, 3, 1), (3, 4, 1), (5, 6, 1), (6, 7, 1), (7, 8, 1), (2, 5, 4), (3, 6, 4), (4, 7, 4)]
        expected_result = [0, 1, 2, 3, 4, 4, 4, 4]
        self.assertEqual(main(n, m, a, b, roads), expected_result)

if __name__ == '__main__':
    unittest.main()
