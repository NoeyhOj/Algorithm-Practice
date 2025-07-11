import sys

input = sys.stdin.readline

n = int(input())
nList = ['U', 'O', 'S']
print(nList[n%3-1])