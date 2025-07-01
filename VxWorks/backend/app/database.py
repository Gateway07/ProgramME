"""Database connection and session management using SQLModel."""
from typing import Generator

from sqlmodel import create_engine, SQLModel, Session

DATABASE_URL = "postgresql+psycopg2://postgres:19121971@localhost:5432/postgres"

engine = create_engine(DATABASE_URL, echo=False)


def init_db() -> None:
    """Create database tables (if they don't exist)."""
    SQLModel.metadata.create_all(engine)


# Dependency for FastAPI routes
def get_session() -> Generator[Session, None, None]:
    """Yield a SQLModel `Session` within a transactional scope.

    Used as a FastAPI dependency. FastAPI detects the generator and
    automatically handles the `try/except/finally` flow around the
    `yield`.
    """
    session: Session = Session(engine)
    try:
        yield session
        session.commit()
    except Exception:  # noqa: BLE001
        session.rollback()
        raise
    finally:
        session.close()
