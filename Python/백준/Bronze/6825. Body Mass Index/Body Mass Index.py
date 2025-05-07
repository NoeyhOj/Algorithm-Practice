import sys

input = sys.stdin.readline
weight = float(input().rstrip())
height = float(input().rstrip())
bmi = weight / (height * height)
if bmi >= 25.0:
    print("Overweight")
elif 18.5 <= bmi < 25.0:
    print("Normal weight")
else:
    print("Underweight")