from datasets import load_dataset
import torch
from transformers import AutoTokenizer, RobertaTokenizerFast

device = "cuda" if torch.cuda.is_available() else "cpu"
print(device)

# This can take a few minutes to load, so grab a coffee or tea while you wait!
raw_datasets = load_dataset("code_search_net", "python")

def get_training_corpus():
    dataset = raw_datasets["train"]
    for start_idx in range(0, len(dataset), 1000):
        samples = dataset[start_idx: start_idx + 1000]
        yield samples["whole_func_string"]

training_corpus = get_training_corpus()

model_path = "D:\\models\\codet5p-220m-py"
old_tokenizer: RobertaTokenizerFast = AutoTokenizer.from_pretrained(model_path, cache_dir=model_path)
tokenizer = old_tokenizer.train_new_from_iterator(training_corpus, 2048)

tokenizer.save_pretrained("code-search-net-tokenizer")
