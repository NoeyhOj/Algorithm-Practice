import sys

input = sys.stdin.readline

n, m = map(int, input().split())
nList = set([input().rstrip() for _ in range(n)])

result = []
for _ in range(m):
    name = input().rstrip()
    if name in nList:
        result.append(name)
    
print(len(result))
for j in sorted(result):
    print(j)
