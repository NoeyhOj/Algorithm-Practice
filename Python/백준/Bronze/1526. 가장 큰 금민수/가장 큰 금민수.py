n = int(input())

for i in range(n,3,-1):
    if(str(i).count('4') + str(i).count('7') == len(str(i))):
        print(i)
        break
else:
    print('실패')