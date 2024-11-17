colorList = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]

a = input()
b = input()
c = input()

result = 0

for i in range(0, len(colorList)):
    if(a == colorList[i]):
        result += i * 10
        for j in range(0, len(colorList)):
            if(b == colorList[j]):
                result += j
                for k in range(0, len(colorList)):
                    if(c == colorList[k]):
                        result *= (10**k)

print(result)