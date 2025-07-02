"""Pydantic response/request schemas separate from ORM models."""
from datetime import datetime
from typing import Optional

from pydantic import BaseModel, Field


class HostBase(BaseModel):
    """Response schema for a Host row.

    Matches columns defined in `models.Host`. Additional fields can be added
    later via separate response schemas if needed.
    """
    id: int
    model: str
    firm: Optional[str] = None
    ip: str
    port: int
    var_address_1: str

    class Config:
        orm_mode = True  # Pydantic v1 compatibility
        # Pydantic v2 replacement for `orm_mode`
        # Allows model_from_attributes in v2 but ignored by v1.
        from_attributes = True


class ValueRow(BaseModel):
    id: int
    created: datetime = Field(..., alias="created")
    host: int
    sv_tempzone1: Optional[float] = None  # noqa: N815
    sv_tempzone2: Optional[float] = None  # noqa: N815
    sv_tempzone3: Optional[float] = None  # noqa: N815
    sv_tempzone4: Optional[float] = None  # noqa: N815
    sv_tempzone5: Optional[float] = None  # noqa: N815
    sv_oiltemp: Optional[float] = None  # noqa: N815
    status: int
    error: Optional[str]

    class Config:
        orm_mode = True
        allow_population_by_field_name = True
        from_attributes = True


class HostStatus(BaseModel):
    """Response schema for a host's status."""
    status: int


class PagedValues(BaseModel):
    values: list[ValueRow]
    total_pages: int
    current_page: int
