userNList = list(map(int, input().split()))

n = min(userNList)

while True:
    count = 0
    i = 1
        
    for i in range(0, len(userNList)):
        if(n % userNList[i] == 0):
            count += 1

    if(count >= 3):
        break
    else:
        n += 1

print(n)