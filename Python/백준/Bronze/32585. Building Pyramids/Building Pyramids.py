import sys
input = sys.stdin.readline

n = int(input().rstrip())
result = 0
a = 0
for i in range(n):
    a += i+1
    result += a
print(result)