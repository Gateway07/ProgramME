from datasets import load_dataset

# Print all the available datasets

# print([dataset.id for dataset in list_datasets()])

# Load a dataset and print the first example in the training set
dataset = load_dataset('Nan-Do/code-search-net-python')
print(dataset['train'][0])

# Process the dataset - add a column with the length of the context texts
dataset_with_length = dataset.map(lambda x: {"length": len(x["context"])})

# Process the dataset - tokenize the context texts (using a tokenizer from the 🤗 Transformers library)
from transformers import AutoTokenizer

tokenizer = AutoTokenizer.from_pretrained('bert-base-cased')

tokenized_dataset = dataset.map(lambda x: tokenizer(x['context']), batched=True)
