'''
2017 팁스타운
짝지어 제거하기
https://programmers.co.kr/learn/courses/30/lessons/12973
'''

from collections import deque

def solution(s):
    s = deque(s)
    passed = []
    
    while s:
        if passed and passed[-1] == s[0]:       # 같은 문자가 연속으로 나오면 해당 문자를 passed에서 제거하고 다음 문자로 이동
            passed.pop()
            s.popleft()
            continue
        
        passed.append(s.popleft())      # 앞의 문자와는 다른 문자가 나오면 passed에 추가하고 다음 문자로 이동
        
    return 0 if passed else 1   # 제거되지 않고 남은 문자가 있으면 0 아니면 1