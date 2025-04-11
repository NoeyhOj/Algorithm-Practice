import re
n = int(input())
sentence = input()
key = sentence[11:-11]
sentences = []
current = ""
count = 0

for char in sentence:
    current += char
    if char == '.':
        sentences.append(current.strip())
        current = ""
if current.strip():
    sentences.append(current.strip())

if n <= 25:
    print(sentence)
else:
    for sent in sentences:
        if sent.find(key) != -1:
            count += 1

    if count == len(sentences):
        print(sentence[:11] + '...' + sentence[-11:])

    else:
        print(sentence[:9] + '......' + sentence[-10:])