const longa = parseFloat(readline().replace(',', '.'));
const lata = parseFloat(readline().replace(',', '.'));
const N = parseInt(readline());
let df = [];
let md = Infinity;
let np = -1;
let x = 0;
let y = 0;
let d = 0;
let lonb = 0;
let latb = 0;

for (let i = 0; i < N; i++) {
    df[i] = readline().split(';');
    df[i][4] = parseFloat(df[i][4].replace(',', '.'));
    df[i][5] = parseFloat(df[i][5].replace(',', '.'));
    lonb = df[i][4];
    latb = df[i][5];
    x = (lonb - longa) * Math.cos((lata + latb)/2);
    y = latb - lata;
    d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 6371;
    if (d < md) {
        md = d;
        np = i;
    }
    printErr(`${i}: ${x}, ${y}, ${d}, ${md}, ${np}`);
}
print(df[np][1]);