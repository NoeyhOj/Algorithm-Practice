import sys

input = sys.stdin.readline

n = int(input())
aSet = set(input().split())
m = int(input())
numList = list(input().split())
resultSet = set()

for i in numList:
    if i in aSet:
        resultSet.add(i)

for j in numList:
    if j in resultSet:
        print('1')
    else:
        print('0')