import bisect, sys
N = int(input())
ho = []
mi, di = sys.maxsize, None
for i in range(N):
    bisect.insort(ho, int(input()))
for i in range(N-1):
    di = ho[i+1] - ho[i]
    if di < mi:
        mi = di
print(mi)