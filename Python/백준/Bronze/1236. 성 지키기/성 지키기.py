import sys

n,m = map(int, input().split())
castleList = [sys.stdin.readline().rstrip() for i in range(n)]
nCount, mCount = 0, 0

for i in range(n):
    if(castleList[i].count('X') == 0):
        nCount += 1

for j in range(m):
    count = 0
    for i in range(n):
        if(castleList[i][j].count('X') == 0):
            count += 1
            if(count == n):
                mCount += 1

print(max(nCount, mCount))