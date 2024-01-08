from transformers import AutoTokenizer, RobertaTokenizerFast, T5ForConditionalGeneration
from transformers import pipeline

model_path = "D:\\models\\codet5p-220m-py"
tokenizer: RobertaTokenizerFast = AutoTokenizer.from_pretrained(model_path, cache_dir=model_path)
encoding = tokenizer.encode("Let's test this tokenizer.")
print(encoding.tokens)

model: T5ForConditionalGeneration = T5ForConditionalGeneration.from_pretrained(model_path)

pipe = pipeline("text-generation", model=model, tokenizer=tokenizer, max_length=256)
txt = """\
# create some data
x = np.random.randn(100)
y = np.random.randn(100)

# create scatter plot with x, y
"""
print(pipe(txt, num_return_sequences=1)[0]["generated_text"])
