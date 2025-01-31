nList = list(input())
joiCount = 0
ioiCount = 0
for i in range(len(nList)-2):
    if(nList[i] == 'J' and nList[i+1] == 'O' and nList[i+2] == 'I'):
        joiCount += 1
    if(nList[i] == 'I' and nList[i+1] == 'O' and nList[i+2] == 'I'):
        ioiCount += 1
print(joiCount)
print(ioiCount)