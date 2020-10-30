'''
Summer/Winter Coding(~2018)
영어 끝말잇기
https://programmers.co.kr/learn/courses/30/lessons/12981
'''

from collections import deque

def solution(n, words):
    words = deque(words)
    prev = words.popleft()
    hash_map = {prev: 1}        # 이미 사용한 단어들을 기록하는 해시테이블
    turn = 1
    
    while words:
        word = words.popleft()
        if word[0] != prev[-1] or word in hash_map:     # 이전 단어를 잇지 않거나 해시테이블에 등록된 단어라면 사람 번호와 차례 반환
            return [(turn % n) + 1, (turn // n) + 1]
        
        hash_map[word] = 1
        prev = word
        turn += 1

    return [0, 0]       # 아무도 걸리지 않고 끝말잇기가 끝났다면