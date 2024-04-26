const i = readline().split(' ');
const lx = +i[0];
const ly = +i[1];
const tx = +i[2];
const ty = +i[3];

let cx = tx, cy = ty;

while (true) {
    const E = +readline();
    let m = '';
    if (cy > ly && cy > 0) {
        m += 'N';
        cy--;
    } else if (cy < ly && cy < 17) {
        m += 'S';
        cy++;
    }
    if (cx > lx && cx > 0) {
        m += 'W';
        cx--;
    } else if (cx < lx && cx < 39) {
        m += 'E';
        cx++;
    }
    print(m);
}