import sys

input = sys.stdin.readline

n = int(input().rstrip())
for _ in range(n):
    seq = input().rstrip()
    ps_count = 0
    if seq[-1] == '(' or seq[0] == ')':
        print("NO")

    else:    
        for i in seq:
            if i == '(':
                ps_count += 1
            elif i == ')':
                ps_count -= 1

            if ps_count < 0:
                break

        if ps_count != 0:
            print('NO')
        else:
            print("YES")