n = int(input())
for _ in range(n):
    nList = list(map(int, input().split()))
    a = nList[0]
    aList = nList[1:]
    avg1 = sum(aList)/a
    bList = [i for i in aList if i > avg1]
    avg2 = (len(bList)/a)*100
    print(f"{avg2:.3f}%")