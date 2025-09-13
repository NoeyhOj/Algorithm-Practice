import sys

input = sys.stdin.readline

n = int(input())
name = input().rstrip()
nList = ['a', 'e', 'o', 'i', 'u']
count = 0

for i in name:
    if i in nList:
        count += 1

print(count)