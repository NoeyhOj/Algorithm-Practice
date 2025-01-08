n = int(input())
print("Gnomes:")
for i in range(n):
    nList = list(map(int, input().split()))
    if(nList == sorted(nList) or nList == sorted(nList,reverse=True)):
        print("Ordered")
    else:
        print("Unordered")