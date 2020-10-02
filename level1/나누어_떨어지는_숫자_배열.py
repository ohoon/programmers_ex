'''
연습문제
나누어 떨어지는 숫자 배열
https://programmers.co.kr/learn/courses/30/lessons/12910
'''

def solution(arr, divisor):
    answer = sorted(list(filter(lambda elem: elem % divisor == 0, arr)))    # divisor로 나누어떨어지는 것만 필터링, 결과물을 sort
    return answer or [-1]   # answer이 비어있으면 [-1] 반환