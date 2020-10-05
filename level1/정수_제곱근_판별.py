'''
연습문제
정수 제곱근 판별
https://programmers.co.kr/learn/courses/30/lessons/12934
'''

import math

def solution(n):
    square = math.sqrt(n)   # n의 제곱근 square
    return (square + 1) ** 2 if square - int(square) == 0 else -1   # n이 제곱수면(square이 정수) square + 1의 제곱 반환, 아니면 -1 반환 