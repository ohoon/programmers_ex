'''
2020 카카오 인턴십
수식 최대화
https://programmers.co.kr/learn/courses/30/lessons/67257
'''

from itertools import permutations

def DFS(expression, operations):
    if expression.isdigit():        # 더 이상 나눌 수 없는 식이면 반환
        return int(expression)
    
    operations_copy = operations[:]
    op = operations_copy.pop()      # 우선순위 낮은 연산부터 수행
    expr = expression.split(op)     # 수행할 연산자 기준으로 수식을 분리
    
    # 각 연산자에 맞는 로직 수행
    if op == '*':
        result = 1
        for x in expr:
            result *= DFS(x, operations_copy)       # 분리된 수식 별로 재귀식으로 상위 우선순위 연산을 수행하고, 그 결과에 * 연산을 수행
    elif op == '+':
        result = 0
        for x in expr:
            result += DFS(x, operations_copy)       # 분리된 수식 별로 재귀식으로 상위 우선순위 연산을 수행하고, 그 결과에 + 연산을 수행
    else:
        result = DFS(expr[0], operations_copy)
        for i in range(1, len(expr)):
            result -= DFS(expr[i], operations_copy)     # 분리된 수식 별로 재귀식으로 상위 우선순위 연산을 수행하고, 그 결과에 - 연산을 수행
    
    return result
    
def solution(expression):
    answer = 0
    op_sets = permutations(['+', '-', '*'], 3)      # 3가지 연산자들의 조합
    
    # 각 조합에 따라 결과를 구해 최댓값을 산출
    for op in op_sets:
        result = abs(DFS(expression, list(op)))
        if result > answer:
            answer = result
    
    return answer

'''
여담

정규표현식과 eval을 안쓰려고 노력했으나 DFS 접근법이 익숙하지 않아 풀이해내는 시간이 좀 오래걸렸음
테스트 결과는 만족스럽지만 좀 더 깔끔하고 빠르게 코딩할 수 있었지 않았을까 하는 아쉬운 기분이 든다.

'''