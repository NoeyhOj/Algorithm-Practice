a,b,c,n = map(int, input().split())
result = 0
if(a == 1):
    print('1')
else:
    for x in range(int(n//a)):
        for y in range(int(n//b)):
            for z in range(int(n//c)):
                if((a*x)+(b*y)+(c*z) == n):
                    result = 1
                    break
            if(result == 1):
                break
        if(result == 1):
            break
    if(result == 1):
        print('1')
    else:
        print('0')