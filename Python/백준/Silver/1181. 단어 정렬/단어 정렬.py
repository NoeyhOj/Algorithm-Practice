n = int(input())
nList = []
for _ in range(n):
    nList.append(input())
nList = list(set(nList))
nList.sort()
nList.sort(key=len)

for i in nList:
    print(i)