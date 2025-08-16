import sys

input = sys.stdin.readline

n = int(input())
nList = list(map(int, input().split()))
nSum = sum(nList)
if nSum == 0:
    print('Stay')
elif nSum < 0:
    print("Left")
elif nSum > 0:
    print("Right")