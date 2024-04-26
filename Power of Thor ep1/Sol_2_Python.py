lx, ly, inx, iny = [int(i) for i in input().split()]
tx, ty = inx, iny
while True:
    rm = int(input())
    dx = ""
    dy = ""
    if tx == lx:
        if ty > ly:
            dy = "N"
            ty -= 1
        elif ty < ly:
            dx = "S"
            ty += 1
    elif ty == ly:
        if tx > lx:
            dx = "W"
            tx -= 1
        elif tx < lx:
            dy = "E"
            tx += 1
    elif tx != lx and ty != ly:
        if ty > ly and tx > lx :
            dy = "NW"
            tx -= 1
            ty -= 1
        elif ty > ly and tx < lx :
            dy = "NE"
            tx += 1
            ty -= 1
        elif ty < ly and tx > lx :
            dx = "SW"
            tx -= 1
            ty += 1
        elif ty < ly and tx < lx :
            dx = "SE"
            tx += 1
            ty += 1
    print(dy + dx)