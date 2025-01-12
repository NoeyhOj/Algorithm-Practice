a = int(input())
b = int(input())
c = int(input())
nList = [a,b,c]
nList.remove(max(nList))
nList.remove(min(nList))
print(nList[0])