import faulthandler
import gc
import glob
import os
import sys
from os import path
from time import perf_counter

from tqdm import tqdm


def run(package: str, input_list, output_list):
    method_name = "main"

    results = []
    try:
        # module = RuntimeModule.from_string("test", code)
        module = __import__(package, fromlist=[method_name])
        method = getattr(module, method_name)  # get_attr second arg must be str
    except Exception as e:
        results.append((-2, e, None, None))
        return results

    for index, inputs in tqdm(enumerate(input_list), total=len(output_list), ncols=0, position=0, leave=True):
        gc.collect()

        check_result = False
        output = None
        faulthandler.enable()
        error = None
        try:
            args = inputs if isinstance(inputs, list) else [inputs]
            output = method(*args)

            check_result = output == output_list[index]
        except Exception as e:
            error = e
            return results
        finally:
            results.append((check_result, error, inputs, output))
            faulthandler.disable()

    return results


def run_problem(problem_path: str):
    io_path = problem_path + "/input_output.py"
    if not path.exists(io_path):
        exit(-1)

    with open(io_path, "r") as file:
        io_code = file.read()

    local = {}
    exec(io_code, {}, local)

    codes = sorted(glob.glob(problem_path + os.sep + 'py' + os.sep + '*.py'))
    for code_path in codes:
        parts = code_path.split(os.sep)
        package = parts[-4] + "." + parts[-3] + "." + parts[-2] + "." + parts[-1].split('.')[0]

        fn = code_path.split(os.sep)[-1]
        code_no = fn.split('.')[0]
        start = perf_counter()
        results = run(package, local['input'], local['output'])
        print("Code #", code_no, "took", perf_counter() - start, "sec")

        for r, e, i, o in results:
            if r:
                continue
            print("Code:", code_path, ", error:", e, ", in/out:", i, '/', o)


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Please set required path to problem's test!")
        exit(-1)
    run_problem(sys.argv[1])
