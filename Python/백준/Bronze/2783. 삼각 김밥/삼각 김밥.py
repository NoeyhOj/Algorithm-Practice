x, y = map(int, input().split())
n = int(input())
resultList = [x*(1000/y)]
for _ in range(n):
    a, b = map(int, input().split())
    resultList.append(a*(1000/b))
print(f"{min(resultList):.2f}")