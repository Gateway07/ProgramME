#!/usr/bin/env python3
import glob
import os
import re

import psycopg2
from psycopg2 import sql

# ——— Configuration ———
INPUT_DIR = "D:/Projects/git/OsmAnd/rag/tickets_en"  # directory containing your .xml files
DB_PARAMS = {'dbname': 'postgres', 'user': 'postgres', 'password': '19121971', 'host': 'localhost', 'port': 5432}


def _extract_tag(tag: str, xml_string: str) -> str:
    # Create a regex pattern to match the tag and its content
    pattern = rf"<{tag}>(.*?)</{tag}>"
    match = re.search(pattern, xml_string, re.DOTALL)
    if match:
        return match.group(1).strip()

    return ''


def parse_ticket_xml(filepath):
    # Derive ticket id from filename (without extension)
    file_path = os.path.basename(filepath)
    ticket_id = int(os.path.splitext(file_path)[0])
    with open(filepath, 'r') as file:
        xml = file.read()

    return {"id": ticket_id, "subject": _extract_tag("subject", xml), "category": _extract_tag("category", xml), "question": _extract_tag("question", xml), "answer": _extract_tag("answer", xml)}


def upsert_ticket(cursor, ticket):
    insert = sql.SQL("""
	                 INSERT INTO qa (id, subject, category, q, a)
	                 VALUES (%(id)s, %(subject)s, %(category)s, %(question)s, %(answer)s)
                     """)
    cursor.execute(insert, ticket)


def main():
    # Connect to the database
    conn = psycopg2.connect(**DB_PARAMS)
    try:
        with conn:
            with conn.cursor() as cur:
                # Iterate XML files
                pattern = os.path.join(INPUT_DIR, "*.md")
                files = glob.glob(pattern)
                if not files:
                    print("No XML files found in", INPUT_DIR)
                    return

                for xml_file in files:
                    try:
                        ticket = parse_ticket_xml(xml_file)
                        upsert_ticket(cur, ticket)
                        print(f"Upserted ticket id={ticket['id']}")
                    except Exception as e:
                        print(f"Error processing {xml_file}: {e}")

        print("All done.")
    finally:
        conn.close()


if __name__ == "__main__":
    main()
