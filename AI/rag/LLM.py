import os
import re
import time
from pathlib import Path

import OpenAIClient
from Knowledge import Knowledge

# ollama@qwen2.5-64k:latest
# ollama@phi3.5:latest
# anthropic@claude-3-5-haiku-20241022
# or@meta-llama/llama-3.3-70b-instruct:free
# or@deepseek/deepseek-chat:free
MODEL_NAME = os.getenv('MODEL_NAME', "or@meta-llama/llama-3.3-70b-instruct:free")
api_key = os.getenv('LLM_API_KEY',
                    "")

# An Ollama client that handles LLM calls both in “normal” mode and using external knowledge.
class LLM:
    def __init__(self):
        self.client = OpenAIClient.OpenAIClient(MODEL_NAME, api_key)

    @staticmethod
    def _extract_tag(tag: str, xml_string: str) -> str:
        # Create a regex pattern to match the tag and its content
        pattern = rf"<{tag}>(.*?)</{tag}>"
        match = re.search(pattern, xml_string, re.DOTALL)
        if match:
            return match.group(1)

        return ''

    def ask(self, sys_prompt: str, user_prompt: str) -> dict:
        start_time = time.time()
        answer = None
        response = ''
        try:
            response = self.client.ask(sys_prompt, user_prompt)
            return response
        except Exception as e:
            print(f"Prompt: {user_prompt}. Error: {e}")
            return response
        finally:
            print(
                f"LLM response time: {time.time() - start_time}, "
                f"Input length: ({len(sys_prompt) + len(user_prompt)} chars = {self.client.prompt_tokens} tokens), "
                f"Output length: ({len(response) if response else -1} chars = {self.client.completion_tokens} tokens), Response: {answer}")


if __name__ == "__main__":
    script_dir = Path(__file__).parent
    with open(script_dir / 'prompts.yaml', 'r', encoding="utf-8") as f:
        prompts = f.read()

    question = "Как программировать и настраивать устройство TSX AEY 800!"

    knowledge = Knowledge()
    # knowledge.store_pdf()
    context = knowledge.knowledge_context(question)

    llm = LLM()
    sys_prompt = prompts.format(CONTEXT=context)
    print(llm.ask(sys_prompt, question))
