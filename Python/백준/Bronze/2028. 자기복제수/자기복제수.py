n = int(input())
for _ in range(n):
    a = int(input())
    result = str(a*a)
    if(result[-len(str(a)):] == str(a)):
        print("YES")
    else:
        print("NO")