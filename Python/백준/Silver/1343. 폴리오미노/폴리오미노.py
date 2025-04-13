n = input()
a = 'AAAA'
b = 'B'
if n.count('.') > 0:
    n = n.split('.')
    for i in range(len(n)):
        if n[i] == '':
            n[i] = '.'  
        elif n[i].count('X') % 2 == 0:
            n[i] = a * (n[i].count('X') // 4) + b * (n[i].count('X') % 4) + '.'
        else:
            print('-1')
            break
    else:
        print(''.join(n)[:-1])
else:
    if(len(n) % 2 == 0):
        print(a * (len(n) // 4) + b * (len(n) % 4))
    else:
        print('-1')