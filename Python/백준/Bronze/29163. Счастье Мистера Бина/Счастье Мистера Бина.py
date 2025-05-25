import sys
input = sys.stdin.readline

n = int(input())
a, b = 0, 0
numList = list(map(int, input().split()))
for i in numList:
    if i % 2 == 0:
        a += 1
    else:
        b += 1
if a > b:
    print("Happy")
else:
    print("Sad")