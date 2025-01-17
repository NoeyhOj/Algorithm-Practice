n = int(input())
nList = [list(map(int,input().split())) for _ in range(n)]
scoreList = [n for _ in range(n)]
for i in range(n-1):
    for j in range(i+1,n):
        if(nList[i][0] > nList[j][0] and nList[i][1] > nList[j][1]):
            scoreList[i] -= 1
        elif(nList[i][0] < nList[j][0] and nList[i][1] < nList[j][1]):
            scoreList[j] -= 1
        else:
            scoreList[i] -= 1
            scoreList[j] -= 1
scoreList = [str(x) for x in scoreList]
print(' '.join(scoreList))