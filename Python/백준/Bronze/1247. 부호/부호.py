import sys
input = sys.stdin.readline

while True:
    try:
        n = int(input().rstrip())
        result = 0
        for _ in range(n):
            result += int(input().rstrip())
        if result == 0:
            print('0')
        elif result > 0:
            print('+')
        else:
            print('-')

    except:
        break