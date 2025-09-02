import sys

input = sys.stdin.readline

n = int(input())
sample = [0 for _ in range(20000001)]
sample_input = list(map(int, input().split()))
for i in sample_input:
    sample[10000000+i] += 1
        
m = int(input())
myCard = list(map(int, input().split()))
result = []

for j in myCard:
    result.append(str(sample[10000000 + j]))

print(' '.join(result))