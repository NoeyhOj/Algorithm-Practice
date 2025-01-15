n = int(input())
for _ in range(n):
    result = ''
    aList = list(input().split())
    for i in aList[1]:
        result += i*int(aList[0])
    print(result)