'''
연습문제
문자열 내 p와 y의 개수
https://programmers.co.kr/learn/courses/30/lessons/12916
'''

def solution(s):
    s = s.lower()   # 소문자로 통일
    return s.count('p') == s.count('y') # p의 개수 == y의 개수