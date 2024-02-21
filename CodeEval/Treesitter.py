from tree_sitter import Language, Parser, Tree

JAVA_LANGUAGE = Language("build/ts-java.dll", "java")
parser = Parser()
parser.set_language(JAVA_LANGUAGE)
tree = parser.parse(
    bytes(
        """
class X {
    int a(int i) {
        return i;
    }
}
""", "utf8", ))

def traverse_tree(tree: Tree):
    cursor = tree.walk()

    reached_root = False
    while reached_root == False:
        yield cursor.node

        if cursor.goto_first_child():
            continue

        if cursor.goto_next_sibling():
            continue

        retracing = True
        while retracing:
            if not cursor.goto_parent():
                retracing = False
                reached_root = True

            if cursor.goto_next_sibling():
                retracing = False

for node in traverse_tree(tree.root_node):
    print(node)
