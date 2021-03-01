'''
2021 KAKAO BLIND RECRUITMENT
순위 검색
https://programmers.co.kr/learn/courses/30/lessons/72412
'''

from itertools import product

def solution(info, query):
    answer = []
    hash_map = {}
    
    for x in info:
        candidate = x.split()
        condition, score = candidate[:-1], int(candidate[-1])
        
        for p in product(*[[c, '-'] for c in condition]):           # -가 나올 경우를 포함해서 모든 조건들의 조합을 구해서 hash_map에 저장
            key = "and".join(p)                                     # 이후에 조건들은 and로 연결되므로
            
            if key in hash_map:
                hash_map[key].append(score)
            else:
                hash_map[key] = [score]
    
    for key in hash_map:                                            # 2진 탐색을 위해 각각의 해시 value들을 역순으로 정렬
        hash_map[key].sort(reverse=True)
    
    for q in query:
        candidate = q.split()
        condition, score = candidate[:-1], int(candidate[-1])
        
        key = "".join(condition)                                    # hash_map에서 key값으로 접근하기 위함
        
        if key in hash_map:
            left, right = 0, len(hash_map[key])                     # 2진탐색하여 점수를 만족하는 사람 수를 구함
            while left < right:
                center = (left + right) // 2
                
                if hash_map[key][center] >= score:
                    left = center + 1
                else:
                    right = center
            
            answer.append(left)
        else:
            answer.append(0)
    
    return answer

'''
여담

너어어어어어무 어려웠다.
정확도를 만족하는건 그렇게 어렵지는 않았지만 효율성때문에 코드만 5번은 갈아치운거 같다..
각각의 조건을 나눠서 hash_map의 key로 지정해놓고 set 교집합 성질을 이용하여 issubset을 써보기도 했지만 결국 효율성을 만족하지 못했다.
이 문제의 키포인트는 query를 분석하는데 걸리는 연산을 최대한 줄이는 것이라고 생각이 들었고,
query를 최대한 그대로 가져가서 hash_map의 key로 만들자 생각을 했다.
하지만 그래도 효율성이 모자라서 뭐가 문젤까 하다가 score을 찾을 때 linear한 탐색보다는 2진탐색으로 해야한단 것을 깨달았다.
정말 머리아프고 오래걸렸지만 그래도 풀이를 하고 나니까 뿌듯하고 코딩 실력에 도움이 많이 된 것 같다.
기억에 잊혀질 쯤 다시 풀어봐야할 듯 싶다.

'''