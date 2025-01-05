import sys
n = int(input())
count = 0
for _ in range(3):
    nList = list(map(int, sys.stdin.readline().split()))
    if(nList.count(7)):
        count += 1
if(count == 3):
    print('777')
else:
    print('0')