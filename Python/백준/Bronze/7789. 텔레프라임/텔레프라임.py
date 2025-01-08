def sosu(n):
    for i in range(2, n//2):
        if(n%i == 0):
            return False
    else:
        return True

a, b = map(int, input().split())
result1 = sosu(a)
newA = int(str(b)+str(a))
result2 = sosu(newA)
if(result1 and result2):
    print("Yes")
else:
    print("No")