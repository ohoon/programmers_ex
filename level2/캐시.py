'''
2018 KAKAO BLIND RECRUITMENT
[1차] 캐시
https://programmers.co.kr/learn/courses/30/lessons/17680
'''

from collections import deque

def solution(cacheSize, cities):
    cache = deque()
    answer = 0
    
    if cacheSize == 0:
        return len(cities) * 5
    
    for city in cities:
        city = city.lower()
        if city in cache:       # 캐시에 이미 존재하는 도시 이름이라면 캐시를 활용하여 작업하고, 큐의 맨 뒤로 이동시킴
            cache.remove(city)
            cache.append(city)
            answer += 1
            continue
        
        if len(cache) == cacheSize:     # 캐시가 가득 찬 상태면, 가장 오랫동안 사용안한 도시를 캐시에서 제거하고 현재 도시 추가
            cache.popleft()
            cache.append(city)
            answer += 5
            continue
        
        cache.append(city)          # 캐시의 여분 자리가 있을 때 캐시에 해당 도시 추가
        answer += 5
            
    return answer

'''
여담

cache의 길이를 cacheSize와 비교하는 것으로 캐시 길이를 관리했는데,
cache = deque(maxlen=cacheSize)처럼 deque에서 제공하는 maxlen옵션을 이용하면 큐 길이 관리를 자동으로 해주는 모양이다.

'''