#시:분:초
#시(1~12)
#분(0~59)
#초(0~59)
import sys

timeList = list(map(int, input().split(':')))
h = []
mOrs = []
count = 0

for i in range(0, len(timeList)):
    if(1 <= timeList[i] <= 12):
        h.append(timeList[i])
    if(0 <= timeList[i] <= 59):
        mOrs.append(timeList[i])
    if(timeList[i] > 59):
        count += 1
        
if(count == 0):
    if(len(h) == 0):
        print('0')
    elif(len(h) == 1):
        print('2')
    elif(len(h) == 2):
        print('4')
    else:
        print('6')
else:
    print('0')