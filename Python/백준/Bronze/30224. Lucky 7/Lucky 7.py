import sys

input = sys.stdin.readline

n = input().rstrip()
if n.count("7") > 0:
    if int(n) % 7 == 0:
        print(3)
    else:
        print(2)
else:
    if int(n) % 7 == 0:
        print(1)
    else:
        print(0)