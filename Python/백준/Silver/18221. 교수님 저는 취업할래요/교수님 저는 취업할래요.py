n = int(input())
nList = []
count = 0
for i in range(n):
    word = input()
    nList.append(word.replace(" ", ""))
    if(nList[i].find('5') != -1):
        pro = [i, nList[i].index('5')]
    if(nList[i].find('2') != -1):
        sung = [i, nList[i].index('2')]
distance = (pro[0]-sung[0])**2 + (pro[1]-sung[1])**2

a = min(sung[0],pro[0])
b = min(sung[1], pro[1])
c = max(sung[0], pro[0])
d = max(sung[1], pro[1])

if(distance >= 25):
    for j in range(a,c+1):
        findOne = nList[j][b:d+1].count('1')
        if(findOne > 0):
            count += findOne
            if(count >= 3):
                print('1')
                break
    else:
        print('0')
else:
    print('0')