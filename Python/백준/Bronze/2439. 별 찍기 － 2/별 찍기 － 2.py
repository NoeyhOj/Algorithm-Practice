import sys

num = int(sys.stdin.readline())
star = "*"

for i in range(num):
    print(str(star*(i+1)).rjust(num))