import sys

input = sys.stdin.readline

n = int(input())
nList = list(map(int, input().split()))

print("yes" if sum(nList) % 3 == 0 else "no")