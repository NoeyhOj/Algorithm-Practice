import sys

doName = input()
n = int(input())
teamList = sorted([sys.stdin.readline().rstrip() for i in range(n)])
maxTeam = maxScore = 0

for i in range(n):
    score = 0
    L = doName.count('L') + teamList[i].count('L')
    O = doName.count('O') + teamList[i].count('O')
    V = doName.count('V') + teamList[i].count('V')
    E = doName.count('E') + teamList[i].count('E')
    score = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100
    if(score > maxScore):
        maxScore = score
        maxTeam = i

print(teamList[maxTeam])