import sys

input = sys.stdin.readline

nList = list(map(int, input().split()))
if nList.count(9):
    print("F")
else:
    print("S")