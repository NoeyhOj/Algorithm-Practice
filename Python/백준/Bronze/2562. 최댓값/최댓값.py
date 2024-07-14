num = 0
count = 0
result_num = 0
result_count = 0

for i in range(9):
    num = int(input())
    count += 1
    if result_num < 0 or num > result_num:
        result_num = num
        result_count = count
            
print(result_num)
print(result_count)