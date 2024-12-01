x, y = map(int, input().split())
dayList = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
count = 0
if(x > 2):
    count += 1
if(x <= 8):
    print(dayList[(31*(x//2) + 30*((x-1)//2 - count) + 28*count + y) % 7])
else:
    print(dayList[(31*((x+1)//2) + 30*((x-2)//2 - count) + 28*count + y) % 7])