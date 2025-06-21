import sys

input = sys.stdin.readline

n = int(input())
x_coords = [0 for _ in range(200001)]
y_coords = [[] for _ in range(200001)]
coords = []
for _ in range(n):
    x, y = map(int, input().split())
    x_coords[100000+x] += 1
    y_coords[100000+x].append(y)

for i in range(len(x_coords)):
    if x_coords[i] != 0:
        for j in sorted(y_coords[i]):
            print(i-100000, j)