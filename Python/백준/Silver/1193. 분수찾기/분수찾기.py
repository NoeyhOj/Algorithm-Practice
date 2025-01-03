n = int(input())
i = 0
key = b = 0
while True:
    if((i*(i+1))/2 < n <= ((i+1)*(i+2))/2):
        key = i+2
        b = int(n-((i*(i+1))/2))
        break
    else:
        i+=1
if(key%2 == 1):
    print(f"{b}/{key-b}")
else:
    print(f"{key-b}/{b}")