import sys

input = sys.stdin.readline

n, k = map(int, input().split())
count = 0
nList = []
for _ in range(n):
    nList.append(int(input()))

for i in nList[::-1]:
    if k >= i:
        count += k // i
        k = k % i
        
print(count)