import sys

input = sys.stdin.readline

a, b = map(int, input().split())
key = min(a, b)
if key == a:
    print(a + (a - 1))
else:
    print(b + (b+1))