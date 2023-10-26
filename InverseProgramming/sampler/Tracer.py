import ast
import functools
import inspect
from typing import Callable, Tuple as T, Union as U

def trace_conditions(func: Callable, return_conditions=False):
    catcher_type = 'yield' if return_conditions else 'print'

    tree = _build_syntactic_tree(func)
    _inject_catchers(tree, catcher_type)
    func = _compile_function(tree, globals_=inspect.stack()[1][0].f_globals)

    if return_conditions:
        func = _gather_conditions(func)
    return func

def _build_syntactic_tree(func):
    code = inspect.getsource(func)
    module = ast.parse(code)
    return module

def _inject_catchers(tree, catcher_type):
    for parent, node in _walk_with_parent(tree):
        if isinstance(node, ast.While):
            _catch_after_while(node, _create_catcher(node, catcher_type))
        elif isinstance(node, ast.If):
            _catch_before_if(parent, node, _create_catcher(node, catcher_type))
    ast.fix_missing_locations(tree)

def _compile_function(tree, globals_):
    output = {}
    exec(compile(tree, filename='<ast>', mode='exec'), globals_, output)
    func_name = tree.body[0].name
    return output[func_name]

def _gather_conditions(func: Callable):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        gen = func(*args, **kwargs)
        conditions = []
        try:
            while True:
                conditions.append(next(gen))
        except StopIteration as e:
            result = e.value
        return result, conditions

    return wrapper

def _catch_after_while(while_node: ast.While, catcher):
    while_node.body.insert(0, catcher)

def _catch_before_if(parent, if_node: ast.If, catcher):
    try:
        idx = parent.body.index(if_node)
        parent.body.insert(idx, catcher)
    except ValueError:
        # handle elif statements
        # elif statements will live in orelse field
        # https://docs.python.org/3/library/ast.html#ast.If
        idx = parent.orelse.index(if_node)
        parent.orelse.insert(idx, catcher)

def _create_catcher(node, catcher_type):
    if catcher_type == 'print':
        return _create_print_catcher(node)
    elif catcher_type == 'yield':
        return _create_yield_catcher(node)
    else:
        raise ValueError(
            f'Unknown catcher_type {catcher_type}, expected: print or yield')

def _create_yield_catcher(node: U[ast.While, ast.If]):
    condition_info = ast.Tuple(
        elts=[
            ast.Constant('while' if isinstance(node, ast.While) else 'if'),
            ast.Constant(_condition_to_string(node)),
            node.test],
        ctx=ast.Load())
    return ast.Expr(ast.Yield(condition_info))

def _create_print_catcher(node: U[ast.While, ast.If]):
    statement_name = 'while' if isinstance(node, ast.While) else 'if'
    str_condition = f'{statement_name} {_condition_to_string(node)} ->'
    call = ast.Call(
        func=ast.Name(id='print', ctx=ast.Load()),
        args=[ast.Constant(str_condition), node.test],
        keywords=[]
    )
    return ast.Expr(call)

def _condition_to_string(node: U[ast.While, ast.If]):
    try:
        str_condition = ast.unparse(node.test)
    except AttributeError:
        str_condition = \
            'Use python 3.9 to get string representation of condition'
    return str_condition

def _walk_with_parent(node) -> T[ast.AST, ast.AST]:
    """
    Modified ast.walk function such that it additionally returns parent node.
    """
    from collections import deque
    todo = deque([(None, node)])
    while todo:
        parent, node = todo.popleft()
        todo.extend([(node, child) for child in ast.iter_child_nodes(node)])
        yield parent, node
