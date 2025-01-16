n = int(input())
for _ in range(n):
    count = 0
    score = 0
    word = input()
    for i in word:
        if(i == 'O'):
            count += 1
            score += count
        else:
            count = 0
    print(score)