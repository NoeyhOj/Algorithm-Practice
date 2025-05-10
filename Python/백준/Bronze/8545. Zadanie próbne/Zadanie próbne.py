import sys
input = sys.stdin.readline

wordList = list(input().rstrip())
print(''.join(wordList[::-1]))