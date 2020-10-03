'''
연습문제
수박수박수박수박수박수?
https://programmers.co.kr/learn/courses/30/lessons/12922
'''

def solution(n):
    pattern = "수박"
    return (pattern * int(n / 2)) + (pattern[0] if n % 2 > 0 else '')   # n/2만큼 수박 반복, n이 홀수면 '수' 추가