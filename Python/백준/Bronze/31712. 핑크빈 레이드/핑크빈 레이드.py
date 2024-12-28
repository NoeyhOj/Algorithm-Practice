cu, du = map(int, input().split())
cd, dd = map(int, input().split())
cp, dp = map(int, input().split())
h = int(input())

count = min(cu, cd, cp)
hs = h-(du+dd+dp)

if(hs <= 0):
    print(0)
else:
    while True:
        if(count % cu == 0):
            hs -= du
        if(count % cd == 0):
            hs -= dd
        if(count % cp == 0):
            hs -= dp
        if(hs <= 0):
            break
        else:
            count += 1
    print(count)