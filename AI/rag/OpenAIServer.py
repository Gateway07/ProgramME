import json
import os
from pathlib import Path

import yaml

from rag.Knowledge import Knowledge

# Set your OpenAI API base and API key here (or via environment variables)
# mistralai/mistral-small-3.1-24b-instruct:free
# google/gemma-3-27b-it:free
# microsoft/phi-3-medium-128k-instruct:free
# qwen/qwq-32b:free (37B)
# qwen/qwen-2.5-72b-instruct:free

# deepseek/deepseek-r1-zero:free
# deepseek/deepseek-r1-distill-qwen-32b:free
# deepseek/deepseek-r1-distill-llama-70b:free
# deepseek/deepseek-chat:free

# meta-llama/llama-3.3-70b-instruct:free
MODEL = "claude-3-5-haiku-20241022"
OPENAI_API_BASE = os.environ.get("OPENAI_API_BASE", "https://api.anthropic.com/v1")

# Load environment variables (ensure OPENAI_API_KEY is set in your environment)
OPENAI_API_KEY = os.getenv("OPENAI_API_KEY",
                           "")
if not OPENAI_API_KEY:
    raise ValueError("OPENAI_API_KEY environment variable is not set.")

from flask import Flask, request, Response, stream_with_context
import requests

app = Flask(__name__)

# logging.basicConfig(level=logging.INFO)
script_dir = Path(__file__).parent
with open(script_dir / 'prompts.yaml', 'r', encoding='utf-8') as f:
    prompts = yaml.safe_load(f)

knowledge = Knowledge()


@app.route('/v1/<path:endpoint>', methods=['GET', 'POST', 'PUT', 'DELETE', 'PATCH'])
def proxy(endpoint):
    target_url = f'{OPENAI_API_BASE}/{endpoint}'

    # Prepare headers
    headers = {}
    for key, value in request.headers:
        if key.lower() == 'authorization' or key.lower() == 'host':
            continue  # Skip client's auth
        headers[key] = value
    headers['Authorization'] = f'Bearer {OPENAI_API_KEY}'

    req_json = request.get_json(silent=True)
    req_json['max_tokens'] = 1024 * 4
    req_json['model'] = MODEL
    question = req_json['messages'][0]['content']
    if not question.startswith("### Task:"):
        context = knowledge.knowledge_context(question)
        sys_prompt = prompts['MAIN'].format(CONTEXT=context)
        messages = [
            {"role": "system", "content": sys_prompt},
            {"role": "user", "content": question}]
        req_json['messages'] = messages
    print(f"Request: {req_json}")

    req = requests.Request(
        method=request.method,
        url=target_url,
        headers=headers,
        data=json.dumps(req_json),
        params=request.args
    )
    # Send request to OpenAI API
    prepared_req = req.prepare()
    session = requests.Session()
    resp = session.send(prepared_req, stream=True)
    print(f"Response: {resp.status_code}")

    excluded_headers = []
    response_headers = {k: v for k, v in resp.headers.items() if k.lower() not in excluded_headers}

    # Add streaming control headers
    response_headers['Cache-Control'] = 'no-cache'
    response_headers['X-Accel-Buffering'] = 'no'
    response_headers['Connection'] = 'keep-alive'

    def generate(verbose: bool = False):
        content = []
        for chunk in resp.iter_content(chunk_size=1024):
            if chunk and chunk.startswith(b'data:'):
                decoded_chunk = chunk.decode('utf-8')
                chunk = decoded_chunk
                for j in chunk.split('data: '):
                    chunk = j.strip()
                    if chunk.startswith('{') and chunk.endswith('}'):
                        cont_json = json.loads(chunk)
                        if "choices" in cont_json and "content" in cont_json["choices"][0]["delta"]:
                            content.append(cont_json["choices"][0]["delta"]["content"])
                yield decoded_chunk
        if verbose:
            print(f"Response: {content}")

    if req_json['stream']:
        return Response(
            stream_with_context(generate()), status=resp.status_code, headers=response_headers,
            content_type='text/event-stream; charset=utf-8'
        )

    return Response(resp.content, status=resp.status_code, headers=response_headers)


if __name__ == '__main__':
    app.run(debug=True)
