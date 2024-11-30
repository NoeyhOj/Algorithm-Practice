row = int(input())
word = input()
col = len(word)//row
wordList = [[0]*row for i in range(col)]
x = count =0
result = ''

for i in range(col):
    if(count % 2 == 0):
        for j in range(row):
            wordList[i][j] = word[x]
            x+=1
    else:
        for j in range(row):
            wordList[i][row-1-j] = word[x]
            x+=1
    count += 1

for j in range(row):
    for i in range(col):
        result += wordList[i][j]

print(result)