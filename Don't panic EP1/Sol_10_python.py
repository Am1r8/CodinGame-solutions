elevators = []
blocked = False
obj = None
last_floor = 0
new_floor = False

nb_floors, width, nb_rounds, exit_floor, exit_pos, nb_total_clones, nb_additional_elevators, nb_elevators = [int(i) for i in input().split()]
for i in range(nb_elevators):
    elevator_floor, elevator_pos = [int(j) for j in input().split()]
    elevators.append({
        "floor": elevator_floor,
        "pos": elevator_pos,
    })

while True:
    clone_floor, clone_pos, direction = input().split()
    floor = int(clone_floor)
    pos = int(clone_pos)
    if last_floor < floor:
        new_floor = True
    closest_elevator = None
    reachable_elevators = [i for i in elevators if i["floor"] == floor]
    _closest = 999999
    if len(reachable_elevators) > 0:
        for i in reachable_elevators:
            if abs(pos - i["pos"]) < _closest:  
                _closest = abs(pos - i["pos"])
                closest_elevator = i        
        obj = closest_elevator
    else:
        obj = {
            "floor": exit_floor, 
            "pos": exit_pos,
        }
    if direction == "LEFT":
        if obj["pos"] > pos and not blocked:
            print("BLOCK")
            blocked = True
        else:
            print("WAIT")
    else:
        if obj["pos"] < pos and not blocked:
            print("BLOCK")
            blocked = True  
        else:
            print("WAIT")
    if new_floor:
        blocked = False
        last_floor = floor
        new_floor = False