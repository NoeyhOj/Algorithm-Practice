chessList = [1, 1, 2, 2, 2, 8]
nList = list(map(int, input().split()))
resultList = [str(chessList[i]-nList[i]) for i in range(6)]
print(' '.join(resultList))