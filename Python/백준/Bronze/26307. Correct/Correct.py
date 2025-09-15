import sys

input = sys.stdin.readline

h, m = map(int, input().split())

print(m + (h-9)* 60)