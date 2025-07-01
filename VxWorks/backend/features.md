# Features List

This document outlines the features to be developed for the backend and frontend of the machine monitoring application.

## Backend (FastAPI)

1. **Host API**:
    - `GET /api/hosts`: Create an endpoint to retrieve all hosts from the database.

2. **values API**:
    - `GET /api/hosts/{host_id}/values`: Create an endpoint to retrieve variables for a specific host, including pagination, sorting, and filtering
      capabilities.

3. **Data Refresh API**:
    - `GET /api/hosts/{host_id}/refresh`: Create an endpoint to trigger a data refresh for a single host by calling `TelnetService.py` and updating the
      database.
    - `GET /api/hosts/refresh`: Create an endpoint to trigger a data refresh for all hosts.

4. **Database Integration**:
    - Establish a connection to the PostgreSQL database using the schema defined in `schema.md`.

5. **Service Integration**:
    - Integrate `TelnetService.py` to fetch live data from the injection molding machines.

## Frontend (React.js)

1. **Dashboard View**:
    - Develop a component to display a list of all hosts.
    - Implement real-time status indicators for each host (e.g., connected, disconnected, expired) with corresponding color codes.
    - Add a "Refresh All" button to trigger a data update for all hosts.
    - Add individual "Refresh" buttons for each host.
    - Make each host in the list a clickable link to its details page.

2. **Host Details View**:
    - Create a page to display detailed information for a selected host.
    - Implement a UI table to display the values of temperature and heating variables associated with the host.
    - Integrate pagination controls for the values table.
    - Add sorting and filtering functionality to the table columns.
    - Ensure there is separate aria to display the last value from values table which should represented as highlighted histogram.

3. **API Integration**:
    - Connect the frontend to the backend API to fetch and display data.
    - Implement logic to call the refresh endpoints and update the UI upon receiving new data.
