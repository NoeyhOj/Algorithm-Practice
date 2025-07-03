import sys

def mode(nList):
    nDict = {}
    maxKeyList = []

    for i in nList:
        if not str(i) in nDict:
            nDict[str(i)] = 1
        else:
            nDict[str(i)] += 1

    for j in nDict:
        if nDict[j] == max(nDict.values()):
            maxKeyList.append(j)

    if len(maxKeyList) == 1:
        print(maxKeyList[0])
    else:
        print(maxKeyList[1])


input = sys.stdin.readline

n = int(input())
nList = sorted([int(input()) for _ in range(n)])

print(int(round(sum(nList) / len(nList), 0)))
print(nList[n//2])
mode(nList)
print(max(nList) - min(nList))