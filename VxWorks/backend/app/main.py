"""FastAPI application with endpoints defined in features.md."""
from __future__ import annotations

from typing import Annotated

from fastapi import Depends, FastAPI, HTTPException, Query, status
from fastapi.middleware.cors import CORSMiddleware
from sqlalchemy import func
from sqlmodel import Session, select

from .database import get_session, init_db
from .models import Host, Vals
from .schemas import HostBase, PagedValues
from .telnet_service import fetch_values

app = FastAPI(title="VxWorks Machine Monitor")

# Allow local dev CORS
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)


@app.on_event("startup")
async def on_startup() -> None:  # noqa: D401
    """Initialise database on startup."""
    init_db()


@app.get("/api/hosts", response_model=list[HostBase])
async def list_hosts(session: Annotated[Session, Depends(get_session)]):
    hosts = session.exec(select(Host)).all()
    return hosts


@app.get("/api/hosts/{host_id}/values", response_model=PagedValues)
async def list_values(
        host_id: int,
        session: Annotated[Session, Depends(get_session)],
        page: int = Query(1, ge=1),
        per_page: int = Query(20, ge=1, le=100),
        sort_by: str | None = None,
        sort_order: str = Query("asc", pattern="^(asc|desc)$"),
        filter_by: str | None = None,
        filter_value: str | None = None,
):
    # Validate host exists
    host = session.get(Host, host_id)
    if host is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Host not found")

    stmt = select(Vals).where(Vals.host == host_id)

    # Apply optional filtering
    if filter_by and filter_value and hasattr(Vals, filter_by):
        stmt = stmt.where(getattr(Vals, filter_by) == filter_value)

    # Apply sorting
    if sort_by and hasattr(Vals, sort_by):
        order_col = getattr(Vals, sort_by)
        if sort_order == "desc":
            order_col = order_col.desc()
        stmt = stmt.order_by(order_col)
    else:
        stmt = stmt.order_by(Vals.created.desc())

    total_records: int = session.exec(
        select(func.count()).select_from(Vals).where(Vals.host == host_id)
    ).one()
    total_pages = (total_records + per_page - 1) // per_page if total_records else 1

    stmt = stmt.offset((page - 1) * per_page).limit(per_page)
    values_rows = session.exec(stmt).all()

    return PagedValues(
        values=values_rows,
        total_pages=total_pages,
        current_page=page,
    )


@app.get("/api/hosts/{host_id}/refresh")
async def refresh_host(host_id: int, session: Annotated[Session, Depends(get_session)]):
    host = session.get(Host, host_id)
    if host is None:
        raise HTTPException(status_code=status.HTTP_404_NOT_FOUND, detail="Host not found")

    # TODO fetch variable list per host dynamically
    fetched = await fetch_values((host.ip, host.port), host.var_address_1)
    if isinstance(fetched, Exception):
        raise HTTPException(status_code=500, detail=str(fetched))
    if fetched is None:
        raise HTTPException(status_code=503, detail="Machine unreachable")

    vals = Vals(host=host_id, **fetched)
    session.add(vals)
    session.commit()

    return {"status": "ok"}


@app.get("/api/hosts/refresh")
async def refresh_all(session: Annotated[Session, Depends(get_session)]):
    hosts = session.exec(select(Host)).all()
    for host in hosts:
        # TODO variable map per host
        fetched = await fetch_values((host.ip, host.port), host.var_address_1)
        if isinstance(fetched, Exception):
            continue
        if fetched is None:
            continue
        vals = Vals(host=host.id, **fetched)
        session.add(vals)
    session.commit()
    return {"status": "ok"}
