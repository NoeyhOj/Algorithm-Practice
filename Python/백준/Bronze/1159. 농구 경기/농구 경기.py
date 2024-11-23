import sys

n = int(input())
player = [sys.stdin.readline().rstrip() for i in range(n)]
repPlayer = ''
i = 0
j = 1
count = 1
player.sort()

try:
    for i in range(1, len(player)):
        if(player[i-1][0] == player[i][0]):
            count += 1
        else:
            count = 1

        if(count >= 5):
            
            repPlayer += player[i-1][0]

    if(len(repPlayer) == 0):
        print("PREDAJA")
    else:
        print(''.join(dict.fromkeys(repPlayer)))
    
except:
    print("안됐음")