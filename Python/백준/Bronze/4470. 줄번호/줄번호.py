import sys
n = int(input())
nameList = [sys.stdin.readline().rstrip() for i in range(n)]

for i in range(n):
    print(str(i+1)+'.', nameList[i])