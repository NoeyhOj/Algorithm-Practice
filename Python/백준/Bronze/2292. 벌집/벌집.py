import sys
input = sys.stdin.readline

n = int(input().rstrip())
result = 1
i = 1

while True:
    if result >= n:
        print(i)
        break
    else:
        result += (6 * i)
        i += 1
