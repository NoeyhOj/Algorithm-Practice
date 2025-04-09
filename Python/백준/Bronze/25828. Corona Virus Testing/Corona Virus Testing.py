g, p, t = map(int, input().split())
result1 = g * p
result2 = g + (p * t)
if(result1 > result2):
    print('2')
elif(result1 < result2):
    print('1')
else:
    print('0')