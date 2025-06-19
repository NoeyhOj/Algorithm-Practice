import sys

input = sys.stdin.readline

S = []
result = []

n = int(input())
for i in range(n):
    total_command = input().rstrip()
    if total_command == "all":
        S = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"]
    elif total_command == "empty":
        S = []
    else:
        if ' ' in total_command:
            command, num = total_command.split()
        if command == "add":
            if S.count(num) == 0:
                S.append(num)
        elif command == "remove":
            if S.count(num) > 0:
                S.remove(num)
        elif command == "check":
            if S.count(num) > 0:
                print(1)
            else:
                print(0)
        elif command == "toggle":
            if S.count(num) > 0:
                S.remove(num)
            else:
                S.append(num)