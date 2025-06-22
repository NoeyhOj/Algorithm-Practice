import sys

input = sys.stdin.readline

n = int(input())
x_coords = [[] for _ in range(200001)]
y_coords = [0 for _ in range(200001)]

for _ in range(n):
    x, y = map(int, input().split())
    y_coords[y + 100000] += 1
    x_coords[y + 100000].append(x)

for i in range(len(y_coords)):
    if y_coords[i] != 0:
        for j in sorted(x_coords[i]):
            print(j, i - 100000)