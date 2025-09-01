import os
import time

# --- Third-party libraries used for knowledge retrieval ---
from FlagEmbedding import FlagReranker
from langchain_chroma import Chroma
from langchain_community.document_loaders import PyPDFLoader
from langchain_community.embeddings import HuggingFaceEmbeddings
from langchain_text_splitters import CharacterTextSplitter

from rag.Ranker import RerankingRetriever

vector_db_dir = os.getenv('VECTOR_DB_DIR', 'D:/Projects/LegProm/vector_db')
rag_reranker_model = os.getenv('RAG_RERANKER_MODEL', "BAAI/bge-reranker-v2-m3")
rag_embeddings_model = os.getenv('RAG_EMBEDDINGS_MODEL', "sentence-transformers/all-MiniLM-L6-v2")
rag_top_k = int(os.getenv('RAG_TOP_K', 16))
knowledge_size = int(os.getenv('KNOWLEDGE_SIZE', 16 * 1024))
pdf_folder_path = "D:/Projects/LegProm/Shnider"


class Knowledge:
    def __init__(self):
        self.embeddings = HuggingFaceEmbeddings(model_name=rag_embeddings_model)

    def _load_vector_db(self):
        return Chroma(persist_directory=vector_db_dir, embedding_function=self.embeddings)

    def knowledge_context(self, question: str):
        start_time = time.time()

        vector_db = self._load_vector_db()
        reranking_retriever = RerankingRetriever(
            base_retriever=vector_db.as_retriever(search_kwargs={"k": rag_top_k}),
            reranker_model=FlagReranker(model_name_or_path=rag_reranker_model))

        knowledge = ""
        parts_in_context = 0
        retrieved_docs = reranking_retriever.get_relevant_documents(f"{question}")
        for doc in retrieved_docs:
            context = doc.page_content
            if len(knowledge) + len(context) >= knowledge_size:
                break
            knowledge += context
            parts_in_context += 1

        print(f"Knowledge length: {len(knowledge)}/{parts_in_context}, "
              f"Retrieving completed: {(time.time() - start_time):.6f} seconds.")
        return knowledge

    def store_pdf(self) -> Chroma:
        documents = []
        for file in os.listdir(pdf_folder_path):
            if file.endswith('.pdf'):
                pdf_path = os.path.join(pdf_folder_path, file)
                loader = PyPDFLoader(pdf_path)
                documents.extend(loader.load())
        text_splitter = CharacterTextSplitter(chunk_size=1024, chunk_overlap=64)
        chunked_documents = text_splitter.split_documents(documents)

        vector_db = Chroma.from_documents(chunked_documents, self.embeddings, persist_directory=vector_db_dir)
        return vector_db
