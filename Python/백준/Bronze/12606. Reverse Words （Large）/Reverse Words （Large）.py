n = int(input())
for i in range(n):
    word = list(input().split())
    newWord = []
    for j in range(1, len(word)+1):
        newWord.append(word[-j])
    print(f"Case #{i+1}: {' '.join(newWord)}")