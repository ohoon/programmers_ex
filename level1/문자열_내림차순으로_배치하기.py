'''
연습문제
문자열 내림차순으로 배치하기
https://programmers.co.kr/learn/courses/30/lessons/12917
'''

def solution(s):
    return ''.join(sorted(s, reverse=True)) # 내림차순으로 정렬 -> 결과값이 리스트이므로 join으로 문자열로 변환