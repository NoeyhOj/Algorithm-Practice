import sys
result = 0
n = 8
data = [sys.stdin.readline().rstrip() for i in range(n)]
for i in range(0, len(data)):
    data[i] = list(data[i])

#1,3,5,7 줄은 1,3,5,7이 흰색(0,2,4,6)
#2,4,6,8 줄은 2,4,6,8이 흰색(1,3,5,7)

for j in range(0, len(data)):
    for k in range(0, len(data[j])):
        if(data[j][k] == "F"):
            if(j % 2 == 0 and k % 2 == 0):
                result += 1
            if(j % 2 == 1 and k % 2 == 1):
                result += 1

print(result)