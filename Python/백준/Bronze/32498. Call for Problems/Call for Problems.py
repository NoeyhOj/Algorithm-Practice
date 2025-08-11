import sys

input = sys.stdin.readline

n = int(input())
count = 0
for _ in range(n):
    num = int(input())
    if num % 2 == 1:
        count += 1
print(count)