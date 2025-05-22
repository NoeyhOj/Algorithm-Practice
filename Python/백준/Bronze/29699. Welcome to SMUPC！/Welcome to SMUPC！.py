import sys
input = sys.stdin.readline

word = "WelcomeToSMUPC"
a = int(input())
print(word[(a-1)%14])