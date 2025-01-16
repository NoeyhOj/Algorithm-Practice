nList = []
for _ in range(10):
    nList.append(int(input())%42)
print(len(set(nList)))