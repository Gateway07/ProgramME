import platform
import re
import struct
import subprocess
import telnetlib
from typing import Dict, Tuple

# --- Configuration ---
TELNET_PROMPT = b"$>"
CONNECTION_TIMEOUT = 5


def ping_host(host):
    # Determine the correct ping command parameters based on the operating system
    os_name = platform.system().lower()
    if os_name == "windows":
        # -n 1: Send 1 echo request
        # -w 1000: Wait 1000ms (1 second) for a reply
        params = ["-n", "1", "-w", "1000"]
    else:  # Linux, macOS, etc.
        # -c 1: Send 1 echo request
        # -W 1: Wait 1 second for a reply
        params = ["-c", "1", "-W", "1"]

    # Build the full command
    command = ["ping"] + params + [host]

    try:
        response = subprocess.run(command, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        if response.returncode == 0:
            return True
        else:
            return False
    except FileNotFoundError:
        return True


def get_data_block(tn_connection, address):
    """Sends the command to read a memory block and returns the raw hex data string."""
    command = f"data {address}\r\n".encode('utf-8')
    tn_connection.write(command)
    output_bytes = tn_connection.read_until(TELNET_PROMPT, CONNECTION_TIMEOUT)
    output_str = output_bytes.decode('utf-8', errors='ignore')

    # Regex to find the line "data = aa bb cc dd ..." and capture the hex part
    match = re.search(r"data\s*=\s*((?:[0-9a-fA-F]{2}\s*)+)", output_str)
    if match:
        # Return the hex string with spaces removed
        return match.group(1).replace(" ", "")

    return Exception(f"ERROR: Could not find 'data = ' in response {output_str} for address {address}.")


def parse_data_block(hex_data: str, variables_in_block: Dict[str, Tuple[str, int, int]]):
    """Parses a raw hex string and extracts all variable values based on the memory map."""
    results = {}
    if not hex_data:
        return results

    # Convert the hex string to a bytes object for unpacking
    try:
        data_bytes = bytes.fromhex(hex_data)
    except ValueError:
        print(f"ERROR: Invalid hex string received: {hex_data}")
        return results

    # For each variable defined for this memory block...
    for var_name, (var_type, offset, size) in variables_in_block.items():
        # Ensure we don't try to read past the end of the data we received
        if offset + size > len(data_bytes):
            results[var_name] = None
            continue

        # Slice the byte array to get the bytes for this specific variable
        variable_bytes = data_bytes[offset: offset + size]

        # Unpack the bytes into a number using the defined type (e.g., '>f' - float, '>i' - int, '?' - bool)
        # struct.unpack returns a tuple, so we get the first element
        value = struct.unpack(var_type, variable_bytes)[0]
        results[var_name] = round(value, 2)  # Round to 2 decimal places for cleaner output

    return results


def get_variable_value(tn, variable_address, variable_dict: Dict[str, Tuple[int, str, int]]) -> Dict[str, int | float | bool]:
    output = get_data_block(tn, variable_address)
    print(output)

    return parse_data_block(output, variable_dict)


def get_values(host: Tuple[str: int], variables: Dict[str, dict]) -> Exception | None | Dict[str, int | float | bool | str]:
    if not ping_host(host[0]):
        return None

    tn = None
    try:
        tn = telnetlib.Telnet(host[0], host[1], timeout=CONNECTION_TIMEOUT)
        tn.read_until(TELNET_PROMPT)

        print(f"Telnet is ready.")
        vals = {}
        for var_address, var_dicts in variables.items():
            temp_values = get_variable_value(tn, var_address, var_dicts)
            if temp_values is not None:
                vals.update(temp_values)
        return vals
    except Exception as e:
        return e
    finally:
        if tn:
            tn.close()


if __name__ == "__main__":
    vars = {'00fe0b27':
        {
            "system.do_TempOutZone1": ('>f', 0, 4),
            "system.do_TempOutZone2": ('>f', 4, 4),
            "system.do_TempOutZone3": ('>f', 8, 4),
            "system.do_TempOutZone4": ('>f', 12, 4),
            "system.do_TempOutZone5": ('>f', 16, 4),
            "system.sv_OilTemp": ('>f', 28, 4),
        }
    }
    # print(parse_data_block("41ac000041a6666741ac000041ad999a", vars['00fe0b27']))

    values = get_values(("192.168.1.241", 4000), vars)
    if values is None:
        print("Host is not available.")
    elif isinstance(values, dict):
        for var, val in values.items():
            print(f"{var}: {val}")
    elif isinstance(values, Exception):
        print(f"An error occurred: {values}")
    else:
        print(f"Unknown: {values}")
