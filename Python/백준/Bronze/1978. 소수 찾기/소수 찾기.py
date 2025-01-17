n = int(input())
nList = list(map(int, input().split()))
count = 0
for i in nList:
    if(i == 1):
        continue
    else:
        for j in range(2, i//2+1):
            if(i%j == 0):
                break
        else:
            count += 1
print(count)