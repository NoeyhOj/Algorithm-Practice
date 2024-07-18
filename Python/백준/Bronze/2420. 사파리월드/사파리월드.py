import sys

a,b = map(int, sys.stdin.readline().split())

result = a - b
if result < 0:
    result *= -1
print(result)