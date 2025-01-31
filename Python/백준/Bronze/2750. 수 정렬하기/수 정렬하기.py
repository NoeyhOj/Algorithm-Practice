n = int(input())
nList = sorted([int(input()) for _ in range(n)])
print(*nList, sep='\n')