import sys

input = sys.stdin.readline

n = int(input())

w, v = map(int, input().split())

a = w // v

if n <= a:
    print(1)
else:
    print(0)