from transformers import AutoTokenizer, RobertaTokenizerFast

model_path = "D:\\models\\codet5-large"
tokenizer: RobertaTokenizerFast = AutoTokenizer.from_pretrained(model_path, cache_dir=model_path)
encoding = tokenizer.tokenize("""
        var ks = new Knapsack();
        assert ks.knapsackRecursive(weight, profit, profit.length, W) == 220;
        assert ks.knapsackDP(weight, profit, profit.length, W) == 220;
""")

print(len(encoding))
print(encoding)
