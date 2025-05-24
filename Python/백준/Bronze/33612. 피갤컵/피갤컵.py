import sys
input = sys.stdin.readline

n = int(input())
year, month = 2024, 8
new_month = (month + ((n-1) * 7))
new_year = year + (new_month // 12)
if new_month % 12 == 0:
    new_month = 12
    new_year -= 1
else:
    new_month %= 12
    
print(new_year, new_month)