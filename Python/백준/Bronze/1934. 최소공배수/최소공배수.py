n = int(input())
resultList = []
for i in range(n):
    a, b = map(int, input().split())
    r = 1
    x = max(a, b)
    y = min(a, b)
    gop = x*y

    while r != 0:
        r = x%y
        x = y
        y = r
    gcp = x
    result = gop // gcp

    resultList.append(result)

for j in resultList:
    print(j)