import sys

input = sys.stdin.readline

n = int(input())
result = []
result = sorted(list(map(int, input().split())))
result_num = 0

for i in range(n):
    result_num += (result[i] * (n-i))

print(result_num)