import json
import traceback

import psycopg2


def process_items(cur, items, parent):
    for item in items:
        link = item['url']
        cur.execute(
            """
			INSERT INTO docs (link, text, parent, path)
			VALUES (%s, %s, %s, %s)
            """,
            (link, item['text'], parent, item['path'])
        )
        # Recurse into nested children
        nested = item.get('nested', [])
        if nested:
            process_items(cur, nested, link)


def load_json(json_path, db_config):
    # Establish connection
    conn = psycopg2.connect(**db_config)
    try:
        with conn:
            with conn.cursor() as cur:
                # Read and parse JSON
                with open(json_path, 'r', encoding='utf-8') as f:
                    data = json.load(f)
                # Process all documents
                process_items(cur, data, 'root')
        print("Data loaded successfully.")
    except Exception:
        print(traceback.format_exc())
    finally:
        conn.close()


if __name__ == '__main__':
    load_json('./docs/sections.json', {'dbname': 'postgres', 'user': 'postgres', 'password': '19121971', 'host': 'localhost', 'port': 5432})
