nba, nbf = int(input()), int(input())
assoc = {}
for i in range(nba):
    ext, mime = input().split()
    assoc[ext.lower()] = mime
for i in range(nbf):
    name = input().lower().split('.') 
    ext = name[-1] if len(name) != 1 else None
    print(assoc[ext] if ext in assoc else "UNKNOWN")