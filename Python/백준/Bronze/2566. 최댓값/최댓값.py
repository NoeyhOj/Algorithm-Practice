import sys
maxList = []
mapList = []
for i in range(9):
    nList = list(map(int, sys.stdin.readline().split()))
    maxList.append(max(nList))
    mapList.append(nList.index(max(nList)))
col = maxList.index(max(maxList))
row = mapList[col]

print(max(maxList))
print(col+1, row+1)