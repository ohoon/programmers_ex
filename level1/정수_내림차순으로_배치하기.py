'''
연습문제
정수 내림차순으로 배치하기
https://programmers.co.kr/learn/courses/30/lessons/12933
'''

def solution(n):
    return int("".join(sorted(list(str(n)), reverse=True)))     # 숫자 -> 문자열 -> 문자들의 리스트 -> 내림차순 정렬 -> 문자열(join)