birth = list(map(int,input().split()))
present = list(map(int,input().split()))
if(birth[0] == present[0]):
    result1 = present[0]-birth[0]
else:
    if(present[1]-birth[1] <= 0):
        if(present[1]-birth[1] == 0):
            if(present[2]-birth[2]<0):
                result1 = present[0]-birth[0]-1
            else:
                result1 = present[0]-birth[0]
        else:
            result1 = present[0]-birth[0]-1
    else:
        result1 = present[0]-birth[0]
result2 = present[0]-birth[0] + 1
result3 = present[0]-birth[0]
print(result1)
print(result2)
print(result3)