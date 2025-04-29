import sys

input = sys.stdin.readline
n = int(input())

for _ in range(n):
    spell, word = input().split()
    if set(word) == set(spell):
        print("YES")
    else:
        print("NO")
