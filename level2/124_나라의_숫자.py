'''
연습문제
124 나라의 숫자
https://programmers.co.kr/learn/courses/30/lessons/12899
'''

def solution(n):
    pattern = ['1', '2' ,'4']
    answer = ""
    
    while (n > 0):
        n -= 1
        answer = pattern[n % 3] + answer
        n //= 3
    
    return answer

'''
다른 사람의 풀이

def solution(n):
    if n <= 3:
        return '124'[n-1]
    else:
        q, r = divmod(n-1, 3) 
        return solution(q) + '124'[r]

멋지게 재귀법으로 푼 모습이다.
반복문이 아니라 재귀법으로도 풀 수 있다는 걸 깔끔하게 보여준거 같다.
아직 재귀법에 대해 익숙하지 않은지 미처 생각하지 못했다.
'''
