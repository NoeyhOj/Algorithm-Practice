n = list(input())
result = ''

for i in range(len(n), 1, -1):
    if(int(n[i-1]) >= 5):
        n[i-1] = '0'
        n[(i-1)-1] = str(int(n[(i-1)-1]) + 1)
    else:
        n[i-1] = '0'

for i in range(len(n)):
    result += n[i]

print(int(result))