a,b,n = map(int, input().split())
a *= 10**n
result = str(a//b)
print(result[-1])