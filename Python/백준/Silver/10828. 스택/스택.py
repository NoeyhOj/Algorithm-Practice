import sys

input = sys.stdin.readline

n = int(input())
nList = []
for _ in range(n):
    command = input().rstrip()
    if command == "pop":
        if len(nList) == 0:
            print('-1')
        else:
            print(nList[-1])
            del nList[-1]
    elif command == "size":
        print(len(nList))
    elif command == "empty":
        if len(nList) == 0:
            print('1')
        else:
            print('0')
    elif command == "top":
        if len(nList) == 0:
            print('-1')
        else:
            print(nList[-1])
    else:
        _, num = command.split()
        nList.append(num)
