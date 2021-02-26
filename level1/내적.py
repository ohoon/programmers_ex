'''
월간 코드 챌린지 시즌1
내적
https://programmers.co.kr/learn/courses/30/lessons/70128
'''

def solution(a, b):
    answer = sum(m * n for m, n in zip(a, b))           # m1 * n1 + m2 * n2 + ... + mx * nx
    return answer