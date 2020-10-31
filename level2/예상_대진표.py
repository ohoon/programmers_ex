'''
2017 팁스타운
예상 대진표
https://programmers.co.kr/learn/courses/30/lessons/12985
'''

def solution(n,a,b):
    answer = 0

    while a != b:   # 참가자 번호가 같다면 그 전 라운드에서 둘이 붙었다는 뜻
        answer += 1
        a = (a + 1) // 2    # 다음 참가자 번호 할당
        b = (b + 1) // 2

    return answer