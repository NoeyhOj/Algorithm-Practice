# 세준: N, 세비: M
# 약한 놈이 죽음
# 약한 놈이 같은 편에 여러명이면 무작위 한 명 죽임
# 약한 놈이 양 편에 있다면, 세비의 약한 병사 죽임
# 승자 출력

n = int(input())
for _ in range(n):
    blank = input()
    N, M = map(int, input().split())
    N_list = sorted(list(map(int, input().split())))
    M_list = sorted(list(map(int, input().split())))
    while True:
        if(len(N_list) == 0):
            print("B")
            break
        elif(len(M_list) == 0):
            print("S")
            break
        if(N_list[0] >= M_list[0]):
            del M_list[0]
        else:
            del N_list[0]