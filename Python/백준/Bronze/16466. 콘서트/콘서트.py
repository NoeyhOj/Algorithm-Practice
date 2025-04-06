n = int(input())
ticketList = set(list(map(int, input().split())))
i = 1
while True:
    if i not in ticketList:
        print(i)
        break
    else:
        i += 1