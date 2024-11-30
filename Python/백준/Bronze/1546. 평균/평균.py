n = int(input())
scoreList = list(map(int, input().split()))
newScoreList = []
ave = 0
for i in range(n):
    newScore = scoreList[i] / max(scoreList) * 100
    newScoreList.append(newScore)

ave = sum(newScoreList) / n

print(ave)