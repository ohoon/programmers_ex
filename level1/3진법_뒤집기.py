'''
월간 코드 챌린지 시즌1
3진법 뒤집기
https://programmers.co.kr/learn/courses/30/lessons/68935
'''

def solution(n):
    answer = 0
    
    while n > 0:
        answer *= 3         # 삽입될 비트를 위해 answer을 shift
        answer += n % 3     # 새로운 비트 삽입
        n //= 3             # n 갱신
        
    return answer