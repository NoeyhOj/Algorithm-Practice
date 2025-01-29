a,b,c = map(int, input().split())
result1 = int(a*b/c)
result2 = int(a/b*c)
print(max(result1, result2))