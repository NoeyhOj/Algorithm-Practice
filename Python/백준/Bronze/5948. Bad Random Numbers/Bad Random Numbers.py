n = input()
middleList = []
count = 0
a = n
while True:
    if(len(a) == 4):
        b = a[1:3]
    elif(len(a) == 3):
        b = a[:2]
    elif(len(a) == 2):
        b = a[:1]
    else:
        b = 0
    b = int(b)
    c = b**2
    count += 1
    if(int(a) == b == c == 0):
        print(count)
        break
    else:
        a = str(c)
    if(middleList.count(b)):
        print(count)
        break
    else:
        middleList.append(b)