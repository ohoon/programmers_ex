'''
연습문제
두 정수 사이의 합
https://programmers.co.kr/learn/courses/30/lessons/12912
'''

def solution(a, b):
    return (abs(a - b) + 1) * (a + b) / 2   # a와 b 사이의 정수 개수 * a와 b의 평균값