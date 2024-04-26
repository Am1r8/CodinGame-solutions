let i = readline().split` `;
const [nbFloors, exitFloor, exitPos] = [+i[0], +i[3], +i[4]];
let nbElevators = +i[7];
const elevators = [];

while(nbElevators--) {
    i = readline().split` `;
    const [elevatorFloor, elevatorPos] = [+i[0], +i[1]];
    elevators[+i[0]] = +i[1];
}

while (true) {
    i = readline().split` `;
    const [cloneFloor, clonePos, direction] = [+i[0], +i[1], i[2]]; 
    const currentExitPos = cloneFloor === exitFloor ? exitPos : elevators[cloneFloor];
    const goingFalseDirection = (
        clonePos > currentExitPos && direction === 'RIGHT' ||
        clonePos < currentExitPos && direction === 'LEFT')
        ? true
        : false;
    print(goingFalseDirection ? 'BLOCK' : 'WAIT');
}