import sys

input = sys.stdin.readline

n = int(input())
for _ in range(n):
    name = input().rstrip()
    if name == "Algorithm":
        print('204')
    elif name == "DataAnalysis":
        print('207')
    elif name == "ArtificialIntelligence":
        print('302')
    elif name == "CyberSecurity":
        print('B101')
    elif name == "Network":
        print('303')
    elif name == "Startup":
        print('501')
    elif name == "TestStrategy":
        print('105')