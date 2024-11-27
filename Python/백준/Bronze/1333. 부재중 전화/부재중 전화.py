n,l,d = map(int, input().split())
listenList = []
bell = d
count = 0

for i in range(0, n):
    listenList.append(l*(i+1) + i*5)

while (count != n):
    if(listenList[count] <= bell < listenList[count] + 5):
        break
    else:
        if(bell < listenList[count]): 
            bell += d
        else:
            count += 1
        
print(bell)