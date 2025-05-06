import sys

input = sys.stdin.readline
n = int(input())
result = []
for i in range(n):
    num = int(input())
    if num == 0:
        del result[len(result)-1]
    else:
        result.append(num)
if len(result) == 0:
    print('0')
else:
    print(sum(result))