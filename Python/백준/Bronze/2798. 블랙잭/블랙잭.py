import sys
input = sys.stdin.readline

n, num = map(int, input().split())
numList = list(map(int, input().split()))
max_num = 0

for i in range(0, n-2):
    for j in range(i+1, n-1):
        for k in range(j+1, n):
            result = numList[i]+numList[j]+numList[k]
            if result <= num:
                max_num = max(max_num, result)
                
print(max_num)