import sys

input = sys.stdin.readline
n, w, h = map(int, input().split())
d = (w ** 2 + h ** 2) ** 0.5 

for _ in range(n):
    one = int(input())
    if one <= w or one <= h or one <= d:
        print("YES")
    else:
        print("NO")