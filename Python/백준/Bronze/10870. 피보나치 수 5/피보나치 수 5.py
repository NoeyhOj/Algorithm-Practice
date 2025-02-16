n = int(input())
a0 = 0
a1 = 1
a2 = 1
if(n == 0):
    print(a0)
elif(n == 1):
    print(a1)
else:
    for _ in range(n-1):
        a2 = a0 + a1
        a0 = a1
        a1 = a2
    print(a2)