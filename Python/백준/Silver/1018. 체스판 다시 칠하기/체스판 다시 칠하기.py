import sys
import math

input = sys.stdin.readline

n, m = map(int, input().split(' '))
a, b = 0, 0
allList = []
count = 0
minCount = math.inf
for _ in range(n):
    allList.append(input().rstrip())

while True:
    changeCounta = 0
    changeCountb = 0
    if (b + 8) > m:
        a += 1
        b = 0
        if (a + 8) > n:
            break
    for i in range(a, a + 8):
        row = allList[i][b:b+8]
        if i == a:
            start = row[0]
        if i % 2 == 0:
            for j in range(8):
                if j % 2 == 0:
                    if row[j] == "W":
                        changeCounta += 1
                else:
                    if row[j] == "B":
                        changeCounta += 1
        else:
            for j in range(8):
                if j % 2 == 0:
                    if row[j] == "B":
                        changeCounta += 1
                else:
                    if row[j] == "W":
                        changeCounta += 1           
        if i % 2 == 0:
            for j in range(8):
                if j % 2 == 0:
                    if row[j] == "B":
                        changeCountb += 1
                else:
                    if row[j] == "W":
                        changeCountb += 1
        else:
            for j in range(8):
                if j % 2 == 0:
                    if row[j] == "W":
                        changeCountb += 1
                else:
                    if row[j] == "B":
                        changeCountb += 1

    changeCount = min(changeCounta, changeCountb)

    if changeCount < minCount:
        minCount = changeCount
    b += 1
    count += 1

print(minCount)