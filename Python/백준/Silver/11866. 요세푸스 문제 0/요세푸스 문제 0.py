import sys

input = sys.stdin.readline

k, n = map(int, input().split())
numList = [i+1 for i in range(k)]
result = []
for j in range(k):
    if j == k-1:
        result.append(str(numList[0]))
        break
    if len(numList) < n:
        numList *= 2
    num = numList[n-1]
    result.append(str(num))
    numList = numList[n:] + numList[:n-1]
    if j > k - n:
        numList = [i for i in numList if i != num]

print(f'<{", ".join(result)}>')