import sys

def half_up(num):
    if num - int(num) >= 0.5:
        return int(num) + 1
    else:
        return int(num)

input = sys.stdin.readline

n = int(input())

if n == 0:
    print(0)
else:
    drop_num = half_up(n * 0.15)
    nList = []
    for _ in range(n):
        nList.append(int(input()))
    if drop_num != 0:
        nList = sorted(nList)[drop_num:-drop_num]
    print(half_up(sum(nList) / len(nList)))