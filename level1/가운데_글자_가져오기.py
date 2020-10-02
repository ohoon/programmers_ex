'''
연습문제
가운데 글자 가져오기
https://programmers.co.kr/learn/courses/30/lessons/12903
'''

import math

def solution(s):
    center = len(s) / 2     # 가운데 인덱스
    answer = s[math.ceil(center - 1):int(center + 1)]   # 올림 연산은 소수점이 없는 경우(짝수일때) +1이 되지 않기 때문에 짝수의 경우엔 [center-1:center+1]이 될것임
    return answer