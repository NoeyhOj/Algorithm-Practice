n = int(input())
count = 0
if n % 10 == n:
    print('0')
    if n % 3 == 0:
        print('YES')
    else:
        print('NO')
else:
    while True:
        n = str(n)
        nList = []
        for i in range(len(n)):
            nList.append(int(n[i]))
        
        n = sum(list(nList))
        count += 1
        if n % 10 == n and n % 3 == 0:
            print(count)
            print("YES")
            break
        elif n % 10 == n and n % 3 != 0:
            print(count)
            print("NO")
            break