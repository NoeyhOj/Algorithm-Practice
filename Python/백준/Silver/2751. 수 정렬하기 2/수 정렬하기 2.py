import sys
n = int(input())
nList = []
for i in range(n):
    a = int(sys.stdin.readline().rstrip())
    nList.append(a)
newList = sorted(nList)
for i in newList:
    print(i)