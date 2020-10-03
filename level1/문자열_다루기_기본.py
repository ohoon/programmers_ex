'''
연습문제
문자열 다루기 기본
https://programmers.co.kr/learn/courses/30/lessons/12918
'''

def solution(s):
    return len(s) in (4, 6) and s.isdigit()     # 문자열 길이가 4나 6이고 숫자인가?

'''
다른 사람의 풀이
def solution(s):
    import re
    return bool(re.match("^(\\d{4}|\\d{6})$", s))
    
그냥 정규식 사용한게 특이해서 가져왔다.
좋은 방법은 아니라고 생각하지만 신선하다고 느낌
'''