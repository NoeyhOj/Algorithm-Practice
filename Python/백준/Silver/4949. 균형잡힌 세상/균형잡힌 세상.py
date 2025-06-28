import sys

input = sys.stdin.readline

while True:
    big_count = 0
    small_count = 0
    seq = input().rstrip()
    cList = []

    if seq == '.':
        break

    for i in seq:
        if i == '(':
            small_count += 1
            cList.append('o')
        elif i == ')':
            small_count -= 1
            if len(cList) > 0:
                if cList[-1] == 'o':
                    del cList[-1]
                else:
                    break
            else:
                break
        elif i == '[':
            big_count += 1
            cList.append('O')
        elif i == ']':
            big_count -= 1
            if len(cList) > 0:
                if cList[-1] == 'O':
                    del cList[-1]
                else:
                    break
            else:
                break

    if big_count == small_count == 0:
        print('yes')
    else:
        print('no')