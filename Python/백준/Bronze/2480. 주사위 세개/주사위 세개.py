numList = sorted(list(map(int, input().split())))
dupList = []

for i in numList:
    if(numList.count(i) != 1):
        dupList.append(i)

if(len(dupList) == 3):
    print(10000 + int(dupList[0]) * 1000)
elif(len(dupList) == 2):
    print(1000 + int(dupList[0]) * 100)
else:
    print(int(numList[2]) * 100)