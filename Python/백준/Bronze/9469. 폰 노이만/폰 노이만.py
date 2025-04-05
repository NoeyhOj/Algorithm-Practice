n = int(input())
for _ in range(n):
    N, D, A, B, F = map(float, input().split())
    result = (D / (A + B))*F
    print(f"{N} {round(result, 6)}")