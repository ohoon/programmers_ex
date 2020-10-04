'''
연습문제
약수의 합
https://programmers.co.kr/learn/courses/30/lessons/12928
'''

import math

def solution(n):
    answer = 0
    
    for i in range(1, int(math.sqrt(n)) + 1):   # n의 제곱근 아래만 탐색
        if (n % i == 0):    # n = i * j
            answer += i + (n // i if i**2 != n else 0)  # answer += i + j, i가 제곱근이면 j는 필요없으므로 0
            
    return answer