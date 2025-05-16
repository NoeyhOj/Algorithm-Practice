import sys
input = sys.stdin.readline

a = int(input())
n = 1
while True:
    b = 100 * n
    if b + (b * 0.1) == a:
        print(b)
        break
    n += 1