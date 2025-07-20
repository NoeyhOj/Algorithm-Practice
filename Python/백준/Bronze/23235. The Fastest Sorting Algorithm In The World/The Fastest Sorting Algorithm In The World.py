import sys

input = sys.stdin.readline
count = 1
while True:
    nList = list(input().split())
    if nList[0] == '0':
        break
    print(f"Case {count}: Sorting... done!")
    count += 1