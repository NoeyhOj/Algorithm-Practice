import sys
a,b = map(int, sys.stdin.readline().split())
n = int(input())
diff = abs(a-b)
nList = []
newList = []
for i in range(n):
    nList.append(int(input()))
    newList.append(abs(nList[i]-b))
key = newList.index(min(newList))

if(diff > abs(nList[key]-b)+1):
    print(abs(nList[key]-b)+1)
else:
    print(diff)