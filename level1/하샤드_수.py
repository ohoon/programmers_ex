'''
연습문제
하샤드 수
https://programmers.co.kr/learn/courses/30/lessons/12947
'''

def solution(x):
    divider = sum(map(int, str(x)))     # 입력값 문자열화 -> 각 자리수 정수화 -> 각 자리수 합
    return x % divider == 0