import sys

n = 7
data = [int(sys.stdin.readline().rstrip()) for i in range(n)]
count = 0
countList = []

for i in range(0, len(data)):
    if(data[i] % 2 != 0):
        count += 1
        countList.append(data[i])

if(count == 0):
    print('-1')
else:
    print(sum(countList))
    print(min(countList))