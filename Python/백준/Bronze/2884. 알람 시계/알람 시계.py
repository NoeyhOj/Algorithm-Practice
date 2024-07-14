import sys

h, m = map(int, sys.stdin.readline().split())

if m - 45 < 0:
    m = 60 + (m - 45)
    if h == 0:
        h = 23
    else:
        h = h - 1
else:
    m = m - 45

print(h, m)
