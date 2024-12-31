n = int(input())
result = 1
num = 0
for i in range(1, n+1):
    result *= i
result1 = int(str(result)[::-1])

print(len(str(result)) - len(str(result1)))