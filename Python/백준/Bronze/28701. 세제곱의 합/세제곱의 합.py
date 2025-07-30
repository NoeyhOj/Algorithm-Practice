import sys

input = sys.stdin.readline

n = int(input())
nList = [i+1 for i in range(n)]
nSum = sum(nList)
print(nSum)
print(nSum**2)
result = 0
for j in nList:
    result += j**3
print(result)