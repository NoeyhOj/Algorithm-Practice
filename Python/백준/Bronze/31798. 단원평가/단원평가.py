a,b,c = map(int, input().split())
if(a == 0):
    a = c**2 - b
    print(a)
elif(b == 0):
    b = c**2 - a
    print(b)
else:
    for i in range(1,(a+b)//2):
        if(i**2 == a+b):
            print(i)
            break