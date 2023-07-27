import argparse

parser = argparse.ArgumentParser(description="Extracting Python's programs as code samples")

parser.add_argument("-c", "--code_path", default="data/APPS/test/", type=str, help="Path to code samples")
parser.add_argument("-o", "--output_path", type=str, help="Path to output tests", required=True)

args = parser.parse_args()
