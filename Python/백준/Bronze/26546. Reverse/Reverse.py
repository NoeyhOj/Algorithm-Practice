n = int(input())
for i in range(n):
    inputList = input().split()
    print(inputList[0][:int(inputList[1])] + inputList[0][int(inputList[2]):])
