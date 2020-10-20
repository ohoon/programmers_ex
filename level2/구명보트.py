'''
탐욕법(Greedy)
구명보트
https://programmers.co.kr/learn/courses/30/lessons/42885
'''

from collections import deque

def solution(people, limit):
    answer = 0
    
    people = deque(sorted(people))    # 몸무게 오름차순으로 정렬

    # 구조해야할 사람이 없을때까지 반복
    while people:
        remained = limit - people[-1]   # 가장 무거운 사람 구조하고 남은 무게 제한
        people.pop()
            
        if people and people[0] <= remained:    # 구조해야할 사람이 남아 있고, 가장 가벼운 사람이 보트에 탈 수 있으면 구조
            people.popleft()
            
        answer += 1
                
    return answer
    

'''
다른 접근 방법으로 푼 풀이

from collections import deque

def solution(people, limit):
    hash_map = {}
    answer = 0
    
    for x in people:
        if x in hash_map:
            hash_map[x] += 1
            continue
        
        hash_map[x] = 1
        
    weight = deque(sorted(hash_map.keys()))
    while weight:
        remained = limit - weight[-1]
        hash_map[weight[-1]] -= 1
        if hash_map[weight[-1]] == 0:
            weight.pop()
            
        if weight and weight[0] <= remained:
            hash_map[weight[0]] -= 1
            if hash_map[weight[0]] == 0:
                weight.popleft()
            
        answer += 1
                
    return answer

두 코드 모두 대략적인 로직은 같지만 해시맵을 이용해서 몸무게 별로 딕셔너리에 넣고, 딕셔너리를 정렬을 하는가? 아니면 그냥 정렬을 하냐 차이다.
만약에 구조해야할 사람이 100만명처럼 엄청나게 큰 수일 때, 그냥 정렬을 하면 N * log(N)이므로 시간복잡도가 크게 되지만
40 ~ 240kg으로 200가지 경우의 수 밖에 안되는 몸무게를 기준으로 딕셔너리에 넣으면 최악의 경우 N만큼의 데이터를 딕셔너리에 넣고 200개의 아이템을 정렬하면 되니 전자에 비해 비용이 적게 들 것이다.
문제에는 최대 5만명이라 그냥 정렬을 하는 로직으로 풀이했다.



'''
