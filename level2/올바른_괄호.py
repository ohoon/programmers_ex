'''
연습문제
올바른 괄호
https://programmers.co.kr/learn/courses/30/lessons/12909
'''

def solution(s):
    stack = []
    
    for x in s:
        if x == '(':        # 여는 괄호를 만나면 닫는 괄호 스택에 추가
            stack.append(')')
            continue
            
        if not stack:       # 닫는 괄호를 만났지만 스택이 비어있으면 False
            return False
        
        stack.pop()         # 닫는 괄호를 만나면 스택에서 닫는 괄호를 pop
    
    return True if not stack else False     # 스택에 여분의 닫는 괄호가 남아있으면 False