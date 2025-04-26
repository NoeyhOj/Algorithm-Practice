import sys
input = sys.stdin.readline

a, b = map(int, input().split())
min_num, max_num = sorted((a, b))
com_num = 1

while True:        
    for i in range(2, min_num+1):
        if min_num % i == 0 and max_num % i == 0:
            min_num //= i
            max_num //= i
            com_num *= i
            break
    else:
        break

print(com_num)
print(com_num * min_num * max_num)