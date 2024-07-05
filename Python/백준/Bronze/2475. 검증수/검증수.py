result = 0
numList = []

numList = map(int, list(input().split()))
#numList.append(a,b,c,d,e)

for i in numList:
    result += i ** 2
    
print(result%10)