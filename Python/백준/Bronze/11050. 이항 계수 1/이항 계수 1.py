import sys

def function1(n, r):
    result = 1
    for i in range(r, n):
        result *= (i + 1)
    return result

def factorial(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

input = sys.stdin.readline
n, r = map(int, input().split())
print(function1(n, r) // factorial(n-r))
