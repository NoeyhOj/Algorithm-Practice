n, k = map(int, input().split())
aList = list(map(int, input().split(',')))
bList = []

if(k == 0):
    bList = aList
else:
    for i in range(k):
        bList = []
        for j in range(len(aList)-1):
            bList.append(aList[j+1] - aList[j])
        if(k != 1):
            aList = bList
        
print(','.join(str(s) for s in bList))