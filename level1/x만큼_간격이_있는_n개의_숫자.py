'''
연습문제
x만큼 간격이 있는 n개의 숫자
https://programmers.co.kr/learn/courses/30/lessons/12954
'''

def solution(x, n):
    return [i for i in range(x, x * (n + 1), x)] if x != 0 else [0] * n     # x에서 x*n까지 x 간격으로 원소를 가지는 리스트 반환, x가 0이면 0이 n개인 리스트 반환