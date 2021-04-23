'''
월간 코드 챌린지 시즌2
괄호 회전하기
https://programmers.co.kr/learn/courses/30/lessons/76502
'''

from collections import deque

def solution(s):
    def isCollect(q):               # 올바른 괄호 문자열인지 검사
        stack = []
        for x in q:
            if x == '(':
                stack.append(')')
                continue

            if x == '[':
                stack.append(']')
                continue

            if x == '{':
                stack.append('}')
                continue

            if (not stack) or (x != stack.pop()):       # 닫는 괄호가 먼저 나오거나 괄호가 매칭되지 않으면 False 반환
                return False

        return not stack        # 아직 매칭되지 않은 괄호가 있는지 검사하여 없으면 True 반환

    answer = 0
    q = deque(s)
    for _ in range(len(s)):
        if isCollect(q):        # 올바른 괄호 문자열이면 answer 증가
            answer += 1

        q.append(q.popleft())   # left shift, q.rotate(-1)도 사용가능

    return answer