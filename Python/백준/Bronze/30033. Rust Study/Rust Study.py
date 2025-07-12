import sys

input = sys.stdin.readline

n = int(input())
nList = list(map(int, input().split()))
mList = list(map(int, input().split()))
count = 0

for i in range(n):
    if nList[i] <= mList[i]:
        count += 1

print(count)