n = int(input())
for i in range(n):
    a,b = map(int, input().split())
    print(a,b)
    if(a == 1):
        print(b)
    else:
        print(a*b-(2*(a-1)))