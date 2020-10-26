'''
연습문제
최솟값 만들기
https://programmers.co.kr/learn/courses/30/lessons/12941
'''

def solution(A,B):
    A.sort()
    B.sort(reverse=True)
    answer = 0
    
    for x, y in zip(A, B):      # A의 작은 값 * B의 큰 값의 합들을 answer에 증가
        answer += x * y

    return answer