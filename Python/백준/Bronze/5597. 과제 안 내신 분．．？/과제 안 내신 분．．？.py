import sys
input = sys.stdin.readline
memberList = [int(i+1) for i in range(30)]
for _ in range(28):
    memberList.remove(int(input()))
print(memberList[0])
print(memberList[1])