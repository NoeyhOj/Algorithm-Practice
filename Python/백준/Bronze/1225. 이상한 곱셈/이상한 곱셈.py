import sys

AandB = list(map(str, sys.stdin.readline().split()))
for i in range(len(AandB)):
    AandB[i] = list(map(int, AandB[i]))

print(sum(AandB[0]) * sum(AandB[1]))