result = 0
result1 = 0
for _ in range(10):
    n = int(input())
    result += n
    if(result >= 100):
        result1 = result - n
        break

if abs(100-result) > abs(100-result1):
    print(result1)
elif abs(100 - result) == abs(100 - result1):
    print(result)
else:
    print(result)