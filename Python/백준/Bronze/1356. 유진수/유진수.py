numList = list(str(input()))
n = len(numList) // 2
count = 0

while True:
    a = b = 1
    if(len(numList) == 1 or n < 0 or n > len(numList) or count > 9):
        print('NO')
        break
    for i in range(n):
        a *= int(numList[i])
    for j in range(len(numList)-n):
        b *= int(numList[n+j])

    if(a == b):
        print('YES')
        break
    elif(a > b):
        if(b == 0):
            n += 1
            count += 1
        else:
            n -= 1
            count += 1
    else:
        if(a == 0):
            n -= 1
            count += 1
        else:
            n += 1
            count += 1