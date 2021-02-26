'''
2021 KAKAO BLIND RECRUITMENT
메뉴 리뉴얼
https://programmers.co.kr/learn/courses/30/lessons/72411
'''

from itertools import combinations

def solution(orders, course):
    answer = []
    hash_map = {}
    
    for n in course:
        for order in orders:
            for combi in combinations(order, n):            # 요구하는 요리 가지수 만큼 후보군을 뽑음
                key = "".join(sorted(combi))
                
                if key not in hash_map:                     # 해당 후보군이 전체 orders에 속한 갯수를 탐색하여 count에 저장
                    count = len(list(filter(lambda x: set(key).issubset(set(x)), orders)))
                    
                    if count > 1:                           # 2회 이상 나온 후보군은 hash_map에 저장
                        hash_map[key] = count
        
        answer += list(filter(lambda x: hash_map[x] == sorted(hash_map.values(), reverse=True)[0], hash_map.keys()))        # 각 n 코스 탐색이 끝나면 최대 빈도인 코스를 골라 answer에 추가
        hash_map.clear()
    
    return sorted(answer)

'''
다른 사람의 풀이

import collections
import itertools

def solution(orders, course):
    result = []

    for course_size in course:
        order_combinations = []
        for order in orders:
            order_combinations += itertools.combinations(sorted(order), course_size)

        most_ordered = collections.Counter(order_combinations).most_common()
        result += [ k for k, v in most_ordered if v > 1 and v == most_ordered[0][1] ]

    return [ ''.join(v) for v in sorted(result) ]

나의 풀이와 거의 유사하지만
순수 dict가 아닌 counter 모듈을 이용해서 빈도수가 많은 숫자들을 쉽게 뽑아낸 풀이다.
most_common이라는 함수 잘 알아놔야겠다.

'''
