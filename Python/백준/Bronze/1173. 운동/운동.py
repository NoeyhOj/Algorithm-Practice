# 영식이의 맥박: X, 운동 후: X+T
# 영식이의 맥박 <= M, 즉, X+T <= M
# 영식이의 1분 휴식 후 맥박: X-R
# 영식이의 맥박 > m, 즉, X-R < m:m
# 초기 맥박:m, 운동시간: N
# 입력: N,m,M,T,R
# 출력: N분 운동하는데 필요한 시간의 최솟값, 만약 N분할 수 없다면 -1 출력

N, m, M, T, R = map(int, input().split())
total_time = 0
exercise_time = 0
X = m
keyward = ""
if(X+T > M and X-R < m):
        print("-1")
else:
    while exercise_time != N:
        if(X+T <= M):
            X = X+T
            exercise_time += 1
            keyward="운동"
        else:
            keyward="휴식"
            if(X-R < m):
                X = m
            else:
                X = X-R
        total_time += 1
    print(total_time)