import sys

h, m = map(int, sys.stdin.readline().split())

new_m = m - 45

if new_m < 0:
    m = 60 + new_m
    if h == 0:
        h = 23
    else:
        h = h - 1
else:
    m = new_m

print(h, m)