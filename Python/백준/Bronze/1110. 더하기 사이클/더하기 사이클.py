n = int(input())

if(n < 10):
    nList = [0, n]
else:
    nList = [n//10, n%10]

newN = nList[1]*10 + sum(nList)%10
count = 1


while(n != newN):
    count += 1
    nList = [newN//10, newN%10]
    newN = nList[1]*10 + sum(nList)%10

print(count)