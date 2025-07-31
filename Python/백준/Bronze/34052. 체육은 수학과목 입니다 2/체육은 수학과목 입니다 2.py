import sys

input = sys.stdin.readline

result = 0
for _ in range(4):
    result += int(input())

if result <= 1500:
    print("Yes")
else:
    print("No")