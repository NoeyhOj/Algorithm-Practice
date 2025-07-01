import sys

input = sys.stdin.readline

n = int(input())
i = 1
num = 0

if n == 1:
    print('1')
else:
    while True:
        if n <= 2 ** i:
            num = i-1
            break
        else:
            i += 1

    print((n - 2**num) * 2)