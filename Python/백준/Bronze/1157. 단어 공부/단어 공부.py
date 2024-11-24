word = input().upper()
wordSet = list(set(word))
wordDic = {}
max = 0
maxKey = ''
count = 0

for i in range(0, len(wordSet)):
    key = wordSet[i]
    value = word.count(key)
    wordDic[key] = value
    if(value>max):
        max = value
        maxKey = key

for i in range(0, len(wordDic)):
    if(wordDic[wordSet[i]] == max):
        count += 1

if(count == 1):
    print(maxKey)
else:
    print('?')