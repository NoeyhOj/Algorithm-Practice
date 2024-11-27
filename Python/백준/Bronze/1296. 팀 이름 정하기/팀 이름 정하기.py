yeonName = input()
n = int(input())
teamList = sorted([input() for i in range(n)])
max = resultI = 0


for i in range(n):
    score = 0
    L = teamList[i].count('L') + yeonName.count('L')
    O = teamList[i].count('O') + yeonName.count('O')
    V = teamList[i].count('V') + yeonName.count('V')
    E = teamList[i].count('E') + yeonName.count('E')
    score = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100
    if (max < score):
        max = score
        resultI = i

print(teamList[resultI])