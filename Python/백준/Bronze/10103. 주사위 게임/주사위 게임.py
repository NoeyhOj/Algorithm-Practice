import sys
input = sys.stdin.readline
a, b = 100, 100
n = int(input().rstrip())
for _ in range(n):
    ad, bd = map(int, input().split())
    if ad < bd:
        a -= bd
    elif ad > bd:
        b -= ad
print(a)
print(b)