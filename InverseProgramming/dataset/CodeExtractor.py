import glob
import json
import os
import os.path
import pprint

from tqdm import tqdm

from dataset.config.ExtractorConfig import args


def extract_apps(code_path: str, output_path: str):
    problems = sorted(glob.glob(code_path + '/*'))
    infos = []
    for problem_idx, problem_path in enumerate(problems):
        index_dir = problem_path.split(os.sep)[-1]
        sol_path = problem_path + '/solutions.json'
        io_path = problem_path + '/input_output.json'
        if os.path.exists(sol_path) and os.path.exists(io_path):
            infos.append((index_dir, sol_path, io_path))

    if not os.path.exists(output_path):
        os.makedirs(output_path)

    for index_dir, sol_path, io_path in tqdm(infos):
        problem_path = output_path + '/p' + index_dir
        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        code_path = problem_path + '/py'
        if not os.path.exists(code_path):
            os.makedirs(code_path)

        tests = json.load(open(io_path, 'r'))
        with open(problem_path + '/input_output.py', 'w') as f:
            f.write("input = ")
            f.writelines([str(tests['inputs']), '\n'])
            f.write("output = ")
            f.write(str(tests['outputs']))

        i = 0
        with open(sol_path, "r") as file:
            codes = json.load(file)
        for code in codes:
            with open(code_path + '/s' + str(i) + '.py', 'w') as f:
                f.write(code)
                i += 1


if __name__ == "__main__":
    argsdict = vars(args)
    print(pprint.pformat(argsdict))

    extract_apps(args.code_path, args.output_path)
