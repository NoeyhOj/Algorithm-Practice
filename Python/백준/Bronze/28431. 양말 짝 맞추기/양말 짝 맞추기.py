nList = []
for _ in range(5):
    nList.append(input())
for i in nList:
    if(nList.count(i)%2 == 1):
        print(i)
        break