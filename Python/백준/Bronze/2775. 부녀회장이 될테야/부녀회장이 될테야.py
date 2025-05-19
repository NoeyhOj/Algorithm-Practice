import sys

input = sys.stdin.readline
k_max, n_max = 15, 15
amu = [[1] * n_max for _ in range(k_max)]

for i in range(n_max):
    amu[0][i] = i+1
for j in range(1, k_max):
    for k in range(1, n_max):
        amu[j][k] = amu[j][k-1] + amu[j-1][k]

t = int(input())
for _ in range(t):
    k = int(input())
    n = int(input())
    print(amu[k][n-1])
    