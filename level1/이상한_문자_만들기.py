'''
연습문제
이상한 문자 만들기
https://programmers.co.kr/learn/courses/30/lessons/12930
'''

def solution(s):
    words = s.lower().split(" ")    # 전체 문장을 소문자로 바꾸고 단어들의 list로 변환
    
    # 한 단어씩 탐색
    for i, w in enumerate(words):
        w = list(w)     # string을 list로 변환

        # 단어의 짝수번째 문자 탐색
        for j in range(0, len(w), 2):
            w[j] = w[j].upper()         # 대문자로 변환

        words[i] = "".join(w)   # upper 작업이 끝난 단어 list를 string으로 변환
        
    return " ".join(words)  # 모든 작업이 끝난 단어들의 list를 string으로 변환