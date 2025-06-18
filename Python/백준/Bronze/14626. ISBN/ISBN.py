import sys

input = sys.stdin.readline

bar_num = input().rstrip()
miss_num = bar_num.find('*')
total = 0

for i in range(12):
    if i == miss_num:
        continue
    else:
        if (i + 1) % 2 == 1:
            num = int(bar_num[i]) * 1
        elif (i + 1) % 2 == 0:
            num = int(bar_num[i]) * 3
        total += num

answer = 10 - int(bar_num[-1])
choose = (miss_num + 1) % 2

if int(bar_num[-1]) == 0:
    answer = 0

for j in range(10):
    if (total + j*(3 - (choose * 2))) % 10 == answer:
        print(j)