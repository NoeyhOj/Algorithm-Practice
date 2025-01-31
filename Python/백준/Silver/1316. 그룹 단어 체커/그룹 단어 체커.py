n = int(input())
count = 0
for _ in range(n):
    nList = ''
    word = list(input())
    for i in range(1, len(word)):
        if(word[i-1] != word[i]):
            nList += word[i-1]
            if(nList.find(word[i]) != -1):
                break
    else:
        count += 1
print(count)