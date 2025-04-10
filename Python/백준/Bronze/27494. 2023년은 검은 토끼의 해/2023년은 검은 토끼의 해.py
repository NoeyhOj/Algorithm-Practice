n = int(input())
year = ['2', '0', '2', '3']
count = 0
for i in range(1, n+1):
    idx = 0
    i = str(i)
    while True:
        plz = i.find(year[idx])
        if plz < 0:
            break
        else:
            if year[idx] == '3':
                count += 1
                break
            else:
                i = i[plz+1:]
                idx += 1
print(count)