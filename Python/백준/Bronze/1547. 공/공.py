m = int(input())
n = 1
for _ in range(m):
    x, y = map(int, input().split())
    if(x == n):
        n = y
    elif(y == n):
        n = x
print(n)