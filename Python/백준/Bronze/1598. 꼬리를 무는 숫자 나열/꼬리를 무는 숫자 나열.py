n,m = map(int, input().split())
a = n//4+1
b = n-((a-1)*4)
c = m//4+1
d = m-((c-1)*4)
if(n%4 == 0):
    a -= 1
    b = 4
if(m%4 == 0):
    c -= 1
    d = 4
result = (max(b,d)-min(b,d))+(max(a,c)-min(a,c))
print(result)