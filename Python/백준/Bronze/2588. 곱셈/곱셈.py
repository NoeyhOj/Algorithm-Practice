import sys
input = sys.stdin.readline

a = int(input())
b = list(reversed(input().rstrip()))
result = 0
for i in range(len(b)):
    answer = a * int(b[i])
    result += (answer * (10**i))
    print(answer)
print(result)