n = int(input())
n0 = 0
n1 = 1
if(n == 0):
    print(n0)
elif(n == 1):
    print(n1)
else:
    for i in range(0, n-1):
        ni = n1 + n0
        n0 = n1
        n1 = ni
    print(ni)