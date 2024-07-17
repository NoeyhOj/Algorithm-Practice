import sys

ascending = [i for i in range(1, 9)]
descending = list(reversed(ascending))
user = list(map(int, sys.stdin.readline().split()))

if user == ascending:
    print('ascending')
elif user == descending:
    print('descending')
else:
    print('mixed')