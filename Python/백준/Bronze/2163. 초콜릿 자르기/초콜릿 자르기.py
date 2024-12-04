n, m = map(int, input().split())
maxNum = max(n, m)
minNum = min(n, m)
count = maxNum*minNum - 1

print(count)