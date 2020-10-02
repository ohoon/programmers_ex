'''
연습문제
2016년
https://programmers.co.kr/learn/courses/30/lessons/12901
'''

from functools import reduce

def solution(a, b):
    answer = ''
    year = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    week = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
    
    if (a == 1):    # 1월이면 전 월 일수 계산 X
        days = b
    else:
        days = reduce(lambda total, monthOfDays: total + monthOfDays, year[:a-1]) + b   # (1...n-1)월의 일수 합 + 현재 n월의 일수
        
    answer = week[(days + 4) % 7]   # 1월 1일이 금요일이므로 +5에 인덱스가 0부터 시작이니 -1, 따라서 +4
    
    return answer