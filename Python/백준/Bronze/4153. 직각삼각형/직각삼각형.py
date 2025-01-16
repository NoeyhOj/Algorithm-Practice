while True:
    nList = list(map(int, input().split()))
    if(nList.count(0) == 3):
        break
    else:
        a = max(nList)
        nList.remove(a)
        if(a**2 == nList[0]**2 + nList[1]**2):
            print('right')
        else:
            print('wrong')