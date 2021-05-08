'''
2021 Dev-Matching: 웹 백엔드 개발자(상반기)
로또의 최고 순위와 최저 순위
https://programmers.co.kr/learn/courses/30/lessons/77484
'''

def solution(lottos, win_nums):
    hash_map = {}
    rank = [6, 6, 5, 4, 3, 2, 1]        # 맞은 개수가 0 ~ 1개면 순위는 6, 2개면 5, ...
    for num in win_nums:
        hash_map[num] = True            # 당첨번호 해시맵 등록
    
    correct, zeros = 0, 0               # 맞은 개수와 0 개수
    for lt in lottos:
        if lt == 0:
            zeros += 1
            continue
            
        if lt in hash_map:
            correct += 1
    
    return [rank[correct + zeros], rank[correct]]
