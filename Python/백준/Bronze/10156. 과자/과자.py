import sys
input = sys.stdin.readline

k,n,m = map(int, input().split())
result = int((k * n) - m)
print(max(result, 0))