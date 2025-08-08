import sys

input = sys.stdin.readline
x, y, z = 1, 1, 0
n, a, b = map(int, input().split())
for _ in range(n):
    x += a
    y += b
    if x < y:
        z = x
        x = y
        y = z
    if x == y:
        y -= 1
    
print(x, y)