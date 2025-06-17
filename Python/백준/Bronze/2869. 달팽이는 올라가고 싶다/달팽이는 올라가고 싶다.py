import sys

input = sys.stdin.readline

a, b, v = map(int, input().split())
count = 0
s = 0

n = (v - b) // (a - b)
if (v - b) % (a - b) == 0:
    print((v - b) // (a - b))
else:
    print((v - b) // (a - b) + 1)
