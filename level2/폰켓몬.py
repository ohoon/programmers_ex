'''
찾아라 프로그래밍 마에스터
폰켓몬
https://programmers.co.kr/learn/courses/30/lessons/1845
'''

def solution(nums):
    pickable = len(nums) / 2        # 집을 수 있는 폰켓몬 수
    kind = len(set(nums))           # 폰켓몬의 종류 수
    
    return pickable if kind > pickable else kind