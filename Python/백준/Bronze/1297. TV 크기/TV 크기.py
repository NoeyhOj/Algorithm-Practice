d,h,w = map(int, input().split())
x = ((d**2 * h**2)/(h**2 + w**2))**0.5
y = (w/h)*x
print(int(x),int(y))