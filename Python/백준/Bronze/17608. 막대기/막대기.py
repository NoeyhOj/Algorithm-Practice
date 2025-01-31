import sys
n = int(input())
nList = list(int(sys.stdin.readline().rstrip()) for _ in range(n))
nList.reverse()
a = 0
count = 0
for i in nList:
    if(i > a):
        a = i
        count += 1
print(count)