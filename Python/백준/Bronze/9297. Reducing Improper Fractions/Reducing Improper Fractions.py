n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    result1 = a//b
    result2 = a%b
    if(result1 == 0 and result2 == 0):
        print(f"Case {i+1}: 0")
    elif(result1 == 0):
        print(f"Case {i+1}: {result2}/{b}")
    elif(result2 == 0):
        print(f"Case {i+1}: {result1}")
    else:
        print(f"Case {i+1}: {result1} {result2}/{b}")
