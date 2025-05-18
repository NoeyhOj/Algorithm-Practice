import sys
input = sys.stdin.readline

n = int(input())
for i in range(n):
    tf = "NO"
    numList = list(map(int, input().split()))
    c = max(numList)
    numList.remove(c)
    if c**2 == numList[0] ** 2 + numList[1] ** 2:
        tf = "YES"
    print(f"Case #{i+1}: {tf}")