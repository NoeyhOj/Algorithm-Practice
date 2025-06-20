import sys

input = sys.stdin.readline

index = 0
word = ''
num = 0
result = 0

for i in range(3):
    word = input().rstrip()
    if word != 'Fizz' and word != 'Buzz' and word != 'FizzBuzz':
        num = int(word)
        index = i
        break

if index == 0:
    result = num+3
elif index == 1:
    result = num+2
elif index == 2:
    result = num+1

if result % 3 == 0 and result % 5 == 0:
    print('FizzBuzz')
elif result % 3 == 0 and result % 5 != 0:
    print('Fizz')
elif result % 3 != 0 and result % 5 == 0:
    print('Buzz')
else:
    print(result)