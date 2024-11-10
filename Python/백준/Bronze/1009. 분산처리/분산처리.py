import sys

testCase = int(input())

for i in range(testCase):
    result = 0
    a,b = map(int, sys.stdin.readline().split())
    num = b%4
    if(num == 0):
        num = 4
    result = (a**num)%10

    if(result == 0):
        print(10)
    else:
        print(result)