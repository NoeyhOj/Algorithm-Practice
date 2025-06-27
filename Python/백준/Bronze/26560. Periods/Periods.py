import sys

input = sys.stdin.readline

n = int(input())
for _ in range(n):
    seq = input().rstrip()
    if seq[-1] != '.':
        print(seq + '.')
    else:
        print(seq)