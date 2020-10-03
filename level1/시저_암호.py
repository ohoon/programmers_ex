'''
연습문제
시저 암호
https://programmers.co.kr/learn/courses/30/lessons/12926
'''

def solution(s, n):
    for i, c in enumerate(s):
        askii = ord(c)          # 문자 c의 아스키코드 넘버

        # 대문자의 경우
        if (64 < askii < 91):
            s = s[:i] + chr(65 + (askii - 65 + n) % 26) + s[i+1:]   # A기준으로 인덱스 구하고 알파벳 개수 26으로 cycle
            continue

        # 소문자의 경우
        if (96 < askii < 123):
            s = s[:i] + chr(97 + (askii - 97 + n) % 26) + s[i+1:]   # a기준으로 인덱스 구하고 알파벳 개수 26으로 cycle
            continue
            
    return s