n = list(input())
nint = sorted(list(map(int, n)), reverse=True)
nstr = list(map(str, nint))
print(''.join(nstr))