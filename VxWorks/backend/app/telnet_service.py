"""Wrapper around existing TelnetService for async usage."""
from __future__ import annotations

import asyncio
from typing import Tuple

from TelnetService import get_values

VARS = {
    "system.do_TempOutZone1": ('>f', 0, 4),
    "system.do_TempOutZone2": ('>f', 4, 4),
    "system.do_TempOutZone3": ('>f', 8, 4),
    "system.do_TempOutZone4": ('>f', 12, 4),
    "system.do_TempOutZone5": ('>f', 16, 4),
    "system.sv_OilTemp": ('>f', 28, 4),
}


async def fetch_values(host: Tuple[str, int], address: str):
    loop = asyncio.get_running_loop()
    return await loop.run_in_executor(None, get_values, host, {address: VARS})
