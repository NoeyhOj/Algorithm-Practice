n, m = map(int, input().split())
count = 0
while True:
    if(count%2 == 0):
        m += n
    else:
        n += m
    if(n >= 5):
        print("yj")
        break
    if(m >= 5):
        print("yt")
        break
    count += 1