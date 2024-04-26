while True:
    m = 0
    im = -1
    for i in range(8):
        mountain_h = int(input())
        if mountain_h > m:
            m = mountain_h
            im = i
    print(im)