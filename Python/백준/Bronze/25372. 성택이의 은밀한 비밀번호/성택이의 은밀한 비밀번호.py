n = int(input())
for i in range(n):
    password = input()
    if(len(password) > 9 or len(password) < 6):
        print("no")
    else:
        print("yes")