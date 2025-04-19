import sys
input = sys.stdin.readline

n = int(input().rstrip())
for i in range(n):
    m = sum(list(map(int, list(str(i)))))
    if i + m == n:
        print(i)
        break
else:
    print('0')
