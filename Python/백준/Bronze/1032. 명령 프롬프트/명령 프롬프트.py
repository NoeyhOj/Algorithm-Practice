import sys
n = int(input())
commander = [sys.stdin.readline().rstrip() for i in range(n)]
result = commander[0]
word = ''

for i in range(1, n):
    for j in range(0, len(commander[0])):
        if(result[j] == commander[i][j]):
            word += result[j]
        else:
            word += '?'
    result = word
    word = ''

print(result)