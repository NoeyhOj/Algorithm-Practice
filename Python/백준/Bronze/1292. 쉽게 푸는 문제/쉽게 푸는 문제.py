n, m = map(int, input().split())
result = 0
a= 1
for i in range(n, m+1):
    while True:
        if(i <= (a* (a+1))//2):
            break
        else:
            a += 1
    result += a

print(result)