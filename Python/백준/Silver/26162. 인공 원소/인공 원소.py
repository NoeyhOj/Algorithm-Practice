import sys
input = sys.stdin.readline

def prime_number(num):
    if num < 2:
        return False
    for i in range(2, num//2+1):
        if num % i == 0:
            return False
    return True

n = int(input().rstrip())
for _ in range(n):
    counter = 0
    num = int(input().rstrip())
    for i in range(2, num//2+1):
        if counter == 1:
            break
        if prime_number(i):
            for j in range(i, num):
                if prime_number(j):
                    if i+j == num:
                        counter = 1
                        break

    print("Yes" if counter else "No")