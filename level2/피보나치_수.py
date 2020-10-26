'''
연습문제
피보나치 수
https://programmers.co.kr/learn/courses/30/lessons/12945
'''

def solution(n):
    first, second = 0, 1
    for _ in range(2, n + 1):
        third = first + second
        first = second
        second = third
    
    return third % 1234567