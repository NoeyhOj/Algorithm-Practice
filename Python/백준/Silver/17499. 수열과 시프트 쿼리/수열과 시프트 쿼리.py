import sys
from collections import deque
n,m = map(int, sys.stdin.readline().split())
numDeque = deque(list(map(int, sys.stdin.readline().split())))
for i in range(m):
    calList = list(map(int, sys.stdin.readline().split()))
    if(calList[0] == 1):
        numDeque[calList[1]-1] += calList[2]
    else:
        if(calList[0] == 2):
            numDeque.rotate(calList[1])
        else:
            numDeque.rotate(-calList[1])
print(*numDeque)