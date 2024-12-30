import datetime

ny, nm, nd = map(int, input().split())
dy, dm, dd = map(int, input().split())

ndt = datetime.datetime(ny, nm, nd)
ddt = datetime.datetime(dy, dm, dd)
diff = ddt - ndt

if(dy - ny > 1000 or (dy-ny == 1000 and (dm >= nm and dd >= nd))):
    print('gg')
else:
    print(f"D-{diff.days}")