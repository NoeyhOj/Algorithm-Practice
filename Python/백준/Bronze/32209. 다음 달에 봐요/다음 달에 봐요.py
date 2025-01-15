n = int(input())
matter = 0
for _ in range(n):
    a,b = map(int, input().split())
    if(a == 1):
        matter += b
    else:
        matter -= b
        if(matter < 0):
            print("Adios")
            break
else:
    print("See you next month")