s1, s2, s3 = map(int, input().split())
result = []

def Mode(result):
    count_list = []
    sorted_result = sorted(list(set(result)))
    for i in sorted_result:
        count_list.append(result.count(i))
    return count_list, sorted_result

for a in range(s1):
    for b in range(s2):
        for c in range(s3):
            result.append(a+b+c+3)
new_result, sorted_result = Mode(result)
print(sorted_result[new_result.index(max(new_result))])