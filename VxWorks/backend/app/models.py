"""Pydantic models mapping to database schema."""
from datetime import date, datetime
from typing import Optional

from sqlmodel import Field, SQLModel


class Host(SQLModel, table=True):
    id: int | None = Field(default=None, primary_key=True)
    model: str
    firm: Optional[str] = None
    ip: str
    port: int = 4000
    no: int
    place: int
    location: str
    serial_no: str
    reg_no: str
    created: date = Field(default_factory=datetime.utcnow)
    var_address_1: str


class Vals(SQLModel, table=True):
    id: int | None = Field(default=None, primary_key=True)
    sv_tempzone1: Optional[float] = None
    sv_tempzone2: Optional[float] = None
    sv_tempzone3: Optional[float] = None
    sv_tempzone4: Optional[float] = None
    sv_tempzone5: Optional[float] = None
    sv_oiltemp: Optional[float] = None
    status: int = 0
    error: Optional[str] = None
    created: datetime = Field(default_factory=datetime.utcnow)
    host: int = Field(foreign_key="host.id")


class Vars(SQLModel, table=True):
    id: int | None = Field(default=None, primary_key=True)
    name: Optional[str] = None
    address: str
    name_ru: str
    size: int
    offset: int  # noqa: A003
    type: str
