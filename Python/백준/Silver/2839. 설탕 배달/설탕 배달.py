import sys

input = sys.stdin.readline
result1, result2 = -1, -1

n = int(input())
if n % 5 == 0:
    result1 = n // 5
elif n % 3 == 0:
    result1 = n // 3

for i in range((n // 5), 0, -1):
    num = n - (5 * i)
    if num % 3 == 0:
        result2 = i + (num // 3)
        break

if result1 == -1:
    print(result2)
elif result2 == -1:
    print(result1)
else:
    print(min(result1, result2))

