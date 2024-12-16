import sys

resultList = []
while True:
    result = ''
    n = int(input())
    if(n == 0):
        break
    wordList = sorted([sys.stdin.readline().rstrip() for i in range(n)])
    for i in range(n-1):
        if(wordList[0].upper() < wordList[i+1].upper()):
            result = wordList[0]
        else:
            wordList[0] = wordList[i+1]
    print(result)