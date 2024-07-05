#시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
num = int(input())//10
result = ""

if num < 6:
    result = 'F'
elif num < 7:
    result = 'D'
elif num < 8:
    result = 'C'
elif num < 9:
    result = 'B'
else:
    result = 'A'
    
print(result)