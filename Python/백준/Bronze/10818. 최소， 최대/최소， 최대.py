import sys

count = int(sys.stdin.readline())
num_list = list(map(int, sys.stdin.readline().split()))

max_num = 0
min_num = 0

for i in range(count):
    if i == 0:
        max_num = num_list[i]
        min_num = num_list[i]
    elif max_num < num_list[i]:
        max_num = num_list[i]
    elif min_num > num_list[i]:
        min_num = num_list[i]
        
print(min_num, max_num)