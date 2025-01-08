import math
a1, p1 = map(int, input().split())
r1, p2 = map(int, input().split())

if((a1*8)*p2 >= (r1*r1*math.pi)*(p1*8)):
    print("Slice of pizza")
else:
    print("Whole pizza")