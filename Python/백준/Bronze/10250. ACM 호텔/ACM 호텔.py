n = int(input())
for _ in range(n):
    h,w,n = map(int,input().split())
    mock = (n+h)//h
    na = n%h
    if(na == 0):
        mock -= 1
        na = h
    if(mock < 10):
        print(f"{na}0{mock}")
    else:
        print(f"{na}{mock}")