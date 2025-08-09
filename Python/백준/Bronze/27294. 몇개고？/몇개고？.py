import sys

input = sys.stdin.readline

t, s = map(int, input().split())
if not(12 <= t <= 16) or s == 1:
    print(280)
else:
    print(320)