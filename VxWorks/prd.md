# 📄 Product Requirements Document (PRD)

## 🟢 Business Context

- Environment:
    * Development platform is on Windows 10.
    * Haitian SA900 with KEBA CP003/Y: This is a common combination for injection molding machines (IMMs) from the 2000s and early 2010s.
    * VxWorks 5.5.1: This is a real-time operating system (RTOS).
    * Telnet: command-line shell on the VxWorks OS.

- Problem:
    * Engineering team spend much time to monitor many technical parameters of Haitian SA900 machines.
    * Head of engineering team wants to see all problems with machine in real-time and track them historically.

- Primary KPI:
    * Reduce time to monitor machines in real-time.
    * Track their live status and specific parameters historically.
    * Increase quality of service to predict machines breakage.

## 🎯 Goals

Create functional requirements based on business context which covers:

1. All information should be saved in Postgres database for run-time monitoring. All Postgres database tables are defined in schema.md file:

- "host" is a list of all machines.
- "vars" is a list of all variables (observable machine parameters).
- "vals" is a list of all values (obtained machine parameters in real-time ).

2. All monitoring values of variables from the machine should be obtained from TelnetService.py (get_values() function) as run-time API.
3. User interface to monitor machines should be based on React.js and FastAPI and include the following:

- UI is dashboard where represented all hosts information (id, model/firm, status) with real-time monitoring.
- Every host has list of variables with their real-time values as pageable table with sortable/filtered columns.
- Main focus should be on the last row of values. It's representation of temperature and Heating Variables:
  Variable Name Description Type
  sv_TempZone1 The actual temperature for heating zone 1 float
  sv_TempZone2 The actual temperature for heating zone 2 float
  sv_TempZone3 The actual temperature for heating zone 3 float
  sv_TempZone4 The actual temperature for heating zone 4 float
  sv_TempZone5 The actual temperature for heating zone 5 float
  sv_OilTemp The actual temperature of the hydraulic oil float

