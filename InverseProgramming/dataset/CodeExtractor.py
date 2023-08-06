import glob
import json
import os
import os.path
import pprint

from datasets import load_dataset
from tqdm import tqdm

from dataset.config.ExtractorConfig import args

def extract_dataset(name: str, output_path: str, split="train", count=10):
    ds = load_dataset(name, split=split, difficulties=["competition"], cache_dir="D:/git/Dataset/huggingface/datasets")

    n = 0
    for sample in iter(ds):
        if n >= count:
            break

        n += 1
        codes = json.loads(sample["solutions"])
        id = sample["problem_id"]
        tests = json.loads(sample["input_output"])
        question = sample["question"]

        problem_path = output_path + '/' + split
        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        problem_path += "/p" + str(id)
        if not os.path.exists(problem_path):
            os.makedirs(problem_path)

        with open(problem_path + '/question.txt', 'w') as f:
            f.write(question)

        if os.path.exists(problem_path + '/input_output.py'):
            continue

        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        if not os.path.exists(problem_path + '/py'):
            os.makedirs(problem_path + '/py')
        code_path = problem_path + '/py'
        if not os.path.exists(code_path):
            os.makedirs(code_path)

        with open(problem_path + '/input_output.py', 'w') as f:
            f.write("input = ")
            f.writelines([str(tests['inputs']), '\n'])
            f.write("output = ")
            f.write(str(tests['outputs']))

        i = 0
        for code in codes:
            with open(code_path + '/s' + str(i) + '.py', 'w') as f:
                f.write(code)
                i += 1

def extract_apps(code_path: str, output_path: str, split="test"):
    problems = sorted(glob.glob(code_path + '/' + split + '/*'))
    infos = []
    for problem_idx, problem_path in enumerate(problems):
        id = problem_path.split(os.sep)[-1]
        sol_path = problem_path + '/solutions.json'
        io_path = problem_path + '/input_output.json'
        if os.path.exists(sol_path) and os.path.exists(io_path):
            infos.append((id, sol_path, io_path))

    if not os.path.exists(output_path):
        os.makedirs(output_path)

    for id, sol_path, io_path in tqdm(infos):
        problem_path = output_path + '/' + split
        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        problem_path += "/p" + str(id)
        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        if os.path.exists(problem_path + '/input_output.py'):
            continue

        if not os.path.exists(problem_path):
            os.makedirs(problem_path)
        if not os.path.exists(problem_path + '/py'):
            os.makedirs(problem_path + '/py')
        code_path = problem_path + '/py/'
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

    # extract_apps(args.code_path, args.output_path)
    extract_dataset("codeparrot/apps", args.output_path, count=1)
