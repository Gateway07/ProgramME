# Features List

This document outlines the features to be developed for the backend and frontend of the machine monitoring application.

## Backend (FastAPI)

Establish a connection to the PostgreSQL database using the schema defined in `schema.md`.

1. **Host API**: `GET /api/hosts`: Create an endpoint to retrieve all hosts from the database.

2. **values API**: `GET /api/hosts/{host_id}/values`: Create an endpoint to retrieve variables for a specific host, including pagination, sorting, and filtering
   capabilities.

3. **Data Refresh API**:
    - `GET /api/hosts/{host_id}/refresh`: Create an endpoint to trigger a data refresh for a single host by calling `TelnetService.py` and updating the
      database.
    - `GET /api/hosts/refresh`: Create an endpoint to trigger a data refresh for all hosts.

4. **Status API**: `GET /api/hosts/{host_id}/status`: Create an endpoint to retrieve the status of a specific host based on latest (by created field) row from
   the "vals" table. If "status" = 0 and "created" > 5 minutes from now then status = 1 (expired) else 0 (alive and connected), if status = -1 then
   disconnected.

5. **Service Integration**: Integrate `TelnetService.py` to fetch live data from the injection molding machines.

# Frontend (React.js)

## UI view areas

Front-end UI should be rich single-page application and main page should be consisted on 3 separated view areas:

1. Hosts list view
2. Values (history) list view
3. Dashboard view

### Sketched main page layout

Main page is lay out on first two parts horizontally:

- 1/3 part on top is for Hosts view (10 % on left side) + Dashboard view (90% om right side)
- 2/3 part on bottom is for Values (history) list view

_______________________________
| Hosts view | Dashboard view |
-------------------------------
| Values (history) list view |
------------------------------

### 1. Hosts View:

- Create an area to display all hosts by using Host API based on sketched main page layout.
- Hosts view should be represented as tree: Firm -> Model -> Id.
- Every leaf should include: number based on "id" field, status icon (0 - green, -1 - red, 1 - yellow) based on "status" field from Status API.
- "Refresh" button (on top of view) should call `GET /api/hosts/{host_id}/refresh` API to update the selected host item.
- "Refresh All" button (on top of view) should call `GET /api/hosts/refresh` API to update the all hosts.
- Refresh calls should be made in blocked manner with indicator to show host by host refresh progress.

### 2. Dashboard View:

- Implement a UI bars for int/float variables to display the monitoring values associated with selected row in Values (history) table.
- Add a legend to each bar to indicate the values of variables.
- The view should include 6 bars (per variable) and coordinate grid with scaling within the view.
- Ensure the view should be refreshed if selected row in Values (history) table is changed.
- If value is None it means missing value and should be represented as empty bar.

### 3. Values (history) view:

- Implement a UI table to display the values of corresponding variables associated with the host.
- Integrate pagination controls for the values table.
- Add sorting and filtering functionality to the table columns.
- Ensure Dashboard view should be refreshed if selected row in Values (history) table is changed.

## **API Integration**:

- Connect the frontend to the backend API to fetch and display data.
- Implement logic to call the refresh endpoints and update the UI upon receiving new data.
