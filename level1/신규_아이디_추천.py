'''
2021 KAKAO BLIND RECRUITMENT
신규 아이디 추천
https://programmers.co.kr/learn/courses/30/lessons/72410
'''

def solution(new_id):
    answer = new_id.lower()         # 소문자화
    answer = "".join(filter(lambda x: x.isalnum() or x in ('-', '_', '.'), answer))     # 조건에 맞지 않는 문자 삭제
    answer = "".join(answer[i] for i in range(len(answer)) if i == len(answer) - 1 or answer[i] != '.' or answer[i+1] != '.')       # ..를 .으로
    answer = answer[1:] if answer and answer[0] == '.' else answer              # 첫 문자와 끝 문자가 .이면 삭제
    answer = answer[:-1] if answer and answer[-1] == '.' else answer
    answer = answer if answer else 'a'                                  # 문자가 공백이면 a 추가
    answer = answer[:15]                                                # 15글자가 되게 자르고 마지막 문자 점검
    answer = answer[:-1] if answer and answer[-1] == '.' else answer
    answer = answer + answer[-1:] * max(3 - len(answer), 0)             # 3글자가 되도록 마지막 문자 반복
    
    return answer

'''
다른 사람의 풀이

import re

def solution(new_id):
    st = new_id
    st = st.lower()
    st = re.sub('[^a-z0-9\\-_.]', '', st)
    st = re.sub('\\.+', '.', st)
    st = re.sub('^[.]|[.]$', '', st)
    st = 'a' if len(st) == 0 else st[:15]
    st = re.sub('^[.]|[.]$', '', st)
    st = st if len(st) > 2 else st + "".join([st[-1] for i in range(3-len(st))])
    return st

사실 쉽게 풀려면 정규식을 쓰면 해결되지만
정규식 구문을 몽땅 외울 필요성을 느끼지는 못했고, 다른 방식으로 푸는게 코드 실력에 도움이 더 될 것 같아 다른 방법을 택했다.

'''