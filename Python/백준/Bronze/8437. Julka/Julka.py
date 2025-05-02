import sys

input = sys.stdin.readline

n = int(input())
k = int(input())
a = (n-k) // 2
b = a + k
print(b)
print(a)