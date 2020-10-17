'''
2020 KAKAO BLIND RECRUITMENT
괄호 변환
https://programmers.co.kr/learn/courses/30/lessons/60058
'''

def is_paired(p):       # 올바른 괄호 문자열인가?
    stack = []
    for x in p:
        # 여는 괄호가 나오면
        if x == '(':
            stack.append(')')
            continue
        
        # 닫는 괄호가 나오면
        if not stack:       # 닫아야할 괄호가 없다면 false
            return False
        
        # 정상적으로 괄호 닫음
        stack.pop()
    
    if stack:       # 아직 닫아야할 괄호가 남았다면 false
        return False
    
    # 정상적으로 모든 괄호가 열고 닫힘
    return True
        
def split(p):       # 균형잡힌 괄호 문자열이 처음으로 나타나면 둘로 분리
    balance = 0
    for i, x in enumerate(p):
        if x == '(':    # 괄호 열면 +1
            balance += 1
        else:           # 괄호 닫으면 -1
            balance -= 1
            
        if balance == 0:        # 열고 닫는 횟수가 같으면 해당 인덱스를 기준으로 분리
            return (p[:i+1], p[i+1:])
        
def reverse(p):     # 괄호 문자 교체 함수 => '(' <-> ')' 
    q = ""
    for x in p:
        if x == '(':    # '(' -> ')'
            q += ')'
            continue
        
        q += '('    # ')' -> '('
    
    return q
    
def solution(p):
    if not p:
        return ""
    
    u, v = split(p)
    if is_paired(u):
        return u + solution(v)
    
    q = '(' + solution(v) + ')' + reverse(u[1:-1])
    
    return q

'''
여담

지문에 충실히 따르면 쉽게 풀 수 있는 문제였다.
 
'''
