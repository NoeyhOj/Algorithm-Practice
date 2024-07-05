num = int(input())
result = []

for i in range(num):
    num1, num2 = map(int,input().split())
    result.append(num1 + num2)
    
for j in range(num):
    print(result[j])