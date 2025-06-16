import sys

input = sys.stdin.readline

n = int(input())

im_list = []
for _ in range(n):
    age, name = input().split()
    im_list.append([int(age), name])

result = sorted(im_list, key=lambda x : x[0])

for i in range(n):
    print(result[i][0], result[i][1])