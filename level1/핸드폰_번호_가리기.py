'''
연습문제
핸드폰 번호 가리기
https://programmers.co.kr/learn/courses/30/lessons/12948
'''

def solution(phone_number):
    return "*" * (len(phone_number) - 4) + phone_number[-4:]    # 핸드폰 번호 마지막 4자리 빼고 *으로 마스킹해서 반환