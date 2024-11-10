N = int(input())
F = int(input())

lastTwo = N % 100
changeNum = N - lastTwo

for i in range(100):
    if(changeNum % F != 0):
        changeNum += 1
    else:
        print(format(changeNum%100, '02'))
        break  