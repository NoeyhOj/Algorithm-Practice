import sys

input = sys.stdin.readline

def factorial(n):
    if n == 1:
        return 1
    else:
        return n + factorial(n-1)

while True:
    n = int(input())
    if n == 0:
        break
    else:
        print(factorial(n))