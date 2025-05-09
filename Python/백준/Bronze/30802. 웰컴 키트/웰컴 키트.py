import sys

input = sys.stdin.readline
n = int(input())
tList = list(input().split())
t, p = map(int, input().split())
count = 0
for i in tList:
    if int(i) % t == 0:
        count += (int(i) // t)
    else:
        count += ((int(i) // t) + 1)
print(count)
print(n // p, n % p)