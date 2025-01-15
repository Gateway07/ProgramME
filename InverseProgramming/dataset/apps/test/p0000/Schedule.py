from z3 import *

# Parameters
courses = ['CL1', 'CL2', 'CL3', 'CC1', 'CC2', 'CC3']
rooms = ['L1', 'L2', 'C1', 'C2', 'C3']
room_capacities = {'L1': 30, 'L2': 50, 'C1': 40, 'C2': 50, 'C3': 30}
course_sizes = {'CL1': 20, 'CL2': 35, 'CL3': 45, 'CC1': 15, 'CC2': 40, 'CC3': 30}
double_length_courses = ['CL3', 'CC2']
time_slots = 5

# Variables
room_assignment = {course: Int(f'room_{course}') for course in courses}
slot_assignment = {course: Int(f'slot_{course}') for course in courses}

# Solver
solver = Solver()

# Constraints
for course in courses:
    # Room must be valid
    solver.add(Or([room_assignment[course] == i for i in range(len(rooms))]))

    # Slot must be valid
    solver.add(slot_assignment[course] >= 0, slot_assignment[course] < time_slots)

    # Capacity constraint
    for room_name in rooms:
        solver.add(course_sizes[course] <= room_capacities[room_name])

    # Room type constraint
    if course in ['CL1', 'CL2', 'CL3']:  # Lab courses
        solver.add(room_assignment[course] < 2)  # Must be L1 or L2
    else:  # Computer courses
        solver.add(room_assignment[course] >= 2)  # Must be C1, C2, or C3

    # Double-length course constraint
    if course in double_length_courses:
        solver.add(slot_assignment[course] + 1 < time_slots)

# Non-overlap constraint
for c1 in courses:
    for c2 in courses:
        if c1 != c2:
            solver.add(Implies(
                And(slot_assignment[c1] == slot_assignment[c2],
                    room_assignment[c1] == room_assignment[c2]),
                False
            ))

# Solve
if solver.check() == sat:
    model = solver.model()
    for course in courses:
        room_idx = model[room_assignment[course]].as_long()
        slot_idx = model[slot_assignment[course]].as_long()
        print(f"{course}: Room {rooms[room_idx]}, Slot {slot_idx}")
else:
    print("No feasible schedule found.")
