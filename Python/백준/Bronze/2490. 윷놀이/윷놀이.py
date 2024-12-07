resultDict = {0:'D',1:'C',2:'B',3:'A',4:'E'}
resultList = []
for i in range(3):
    nList = list(map(int, input().split()))
    resultList.append(resultDict.get(sum(nList)))

for i in resultList:
    print(i)