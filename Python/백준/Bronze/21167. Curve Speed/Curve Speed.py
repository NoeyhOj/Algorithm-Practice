import sys
input = sys.stdin.readline
while True:
    try:
        r, s = map(float, input().split())
        v = ((r*(s+0.16)) / 0.067) ** 0.5
        print(round(v))
    except:
        break