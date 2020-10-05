'''
연습문제
제일 작은 수 제거하기
https://programmers.co.kr/learn/courses/30/lessons/12935
'''

def solution(arr):
    arr.remove(min(arr))    # 가장 작은 숫자 삭제
    return arr if arr else [-1]     # 배열이 비어있으면 [-1] 반환