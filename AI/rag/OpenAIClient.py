import os
import time
from typing import List, Tuple

import openai

base_urls = {"ollama": "http://localhost:11434/v1", "or": "https://openrouter.ai/api/v1",
             "dp": "https://api.deepseek.com/v1", "veles": "https://veles.osmand.net:8081/api",
             "anthropic": "https://api.anthropic.com/v1"}
temperature = float(os.getenv('MODEL_TEMPERATURE', 0.2))
top_p = float(os.getenv('MODEL_TOP_P', 0.6))  # Controls randomness; lower is more deterministic
max_tokens = 8 * 1024  # Limit the response length


class OpenAIClient:
    prompt_tokens = -1
    completion_tokens = -1
    cached_tokens = -1
    duration = -1

    def __init__(self, model: str, api_key: str, api_url: str = None):
        parts = model.split('@')
        if parts[0] not in base_urls:
            raise Exception(f"Invalid OpenAI model: {model}")
        elif parts[0] == 'ollama':
            api_key = 'ollama'

        base_url = base_urls[parts[0]]
        if api_url is not None:
            base_url = api_url

        self.model = parts[1]
        self.client = openai.OpenAI(base_url=base_url, api_key=api_key)
        self._init()

    def _init(self):
        self.prompt_tokens = -1
        self.completion_tokens = -1
        self.cached_tokens = -1
        self.duration = -1

    def native_ask(self, system_prompt: str, user_query: str):
        start_time = time.time()
        self._init()

        response = self.client.chat.completions.create(model=self.model, messages=[
            # There are the following roles: system/user/assistant
            # system - instructions (tools) for shaping behavior which is most authoritative.
            # user - input query which is medium authoritative.
            # assistant - to send back “assistant” messages (and “user” messages) as further context to more accurate completions.
            {"role": "system", "content": system_prompt}, {"role": "user", "content": user_query}],
                                                       max_tokens=max_tokens,
                                                       n=1,  # Number of completions to generate
                                                       temperature=temperature,
                                                       top_p=top_p)
        return response

    def ask(self, system_prompt: str, user_query: str):
        start_time = time.time()
        self._init()

        response = self.client.chat.completions.create(model=self.model, messages=[
            # There are the following roles: system/user/assistant
            # system - instructions (tools) for shaping behavior which is most authoritative.
            # user - input query which is medium authoritative.
            # assistant - to send back “assistant” messages (and “user” messages) as further context to more accurate completions.
            {"role": "system", "content": system_prompt}, {"role": "user", "content": user_query}],
                                                       max_tokens=max_tokens,
                                                       n=1,  # Number of completions to generate
                                                       temperature=temperature,
                                                       top_p=top_p)
        if response.usage:
            self.prompt_tokens = response.usage.prompt_tokens
            self.completion_tokens = response.usage.completion_tokens
            if response.usage.prompt_tokens_details:
                self.cached_tokens = response.usage.prompt_tokens_details.cached_tokens
        self.duration = time.time() - start_time

        return response.choices[0].message.content

    def ask_with_image(self, system_prompt: str, images: List[Tuple[str, str]]):
        start_time = time.time()
        self._init()

        content = []
        for img in images:
            content.append({"type": "text", "text": img[0]})
            content.append({"type": "image_url", "image_url": {"url": f"data:image/jpeg;base64,{img[1]}"}})
        response = self.client.chat.completions.create(model=self.model, messages=[
            {"role": "system", "content": system_prompt},
            {"role": "user", "content": content}],
                                                       max_tokens=max_tokens,
                                                       n=1,
                                                       temperature=temperature,
                                                       top_p=top_p)
        if response.usage:
            self.prompt_tokens = response.usage.prompt_tokens
            self.completion_tokens = response.usage.completion_tokens
            if response.usage.prompt_tokens_details:
                self.cached_tokens = response.usage.prompt_tokens_details.cached_tokens
        self.duration = time.time() - start_time

        return response.choices[0].message.content
