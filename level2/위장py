'''
해시
위장
https://programmers.co.kr/learn/courses/30/lessons/42578
'''

from functools import reduce

def solution(clothes):
    closet = {}
    
    for x in clothes:
        if x[1] in closet:          # 이미 의상 종류가 딕셔너리에 있으면 갯수 +1
            closet[x[1]] += 1
            continue
        
        closet[x[1]] = 1        # 의상 종류 등록
        
    return reduce(lambda answer, x: answer * (x + 1), closet.values(), 1) - 1       # 각 의상 종류+1 들의 곱 - 1 => 의상 조합의 모든 경우의 수 - 공집합
    

'''
다른 사람의 풀이

from collections import Counter
from functools import reduce

def solution(clothes):
    cnt = Counter([kind for name, kind in clothes])
    answer = reduce(lambda x, y: x*(y+1), cnt.values(), 1) - 1
    return answer

내가 딕셔너리로 푼 것을 counter 모듈을 사용함으로써 단축시킨 모습이다.
뭐 해시를 쓰고 말고는 개인차지만 모듈을 불러올 때 걸리는 시간 때문에 아마도 더 비용이 커질지 않을까 싶다.

'''
