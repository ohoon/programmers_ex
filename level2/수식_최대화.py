'''
2020 카카오 인턴십
수식 최대화
https://programmers.co.kr/learn/courses/30/lessons/67257
'''

from itertools import permutations

def DFS(expression, operations):
    if expression.isdigit():
        return int(expression)
    
    operations_copy = operations[:]
    op = operations_copy.pop()
    expr = expression.split(op)
    
    if op == '*':
        result = 1
        for x in expr:
            result *= DFS(x, operations_copy)
    elif op == '+':
        result = 0
        for x in expr:
            result += DFS(x, operations_copy)
    else:
        result = DFS(expr[0], operations_copy)
        for i in range(1, len(expr)):
            result -= DFS(expr[i], operations_copy)
    
    return result
    
def solution(expression):
    answer = 0
    op_sets = permutations(['+', '-', '*'], 3)
    
    for op in op_sets:
        result = abs(DFS(expression, list(op)))
        if result > answer:
            answer = result
    
    return answer

'''
여담

정규표현식과 eval을 안쓰려고 노력했으나 DFS 접근법이 익숙하지 않아 풀이해내는 시간이 좀 오래걸렸음
테스트 결과는 만족스럽지만 좀 더 깔끔하게 코딩할 수 있었지 않았을까 아쉬운 기분이 든다.

'''