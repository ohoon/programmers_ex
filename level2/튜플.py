'''
2019 카카오 개발자 겨울 인턴십
튜플
https://programmers.co.kr/learn/courses/30/lessons/64065
'''

def solution(s):
    hash_map = {}
    cursor = 1
    sets = eval(s[1:-1])        # set들의 튜플로 분리
    
    if len(sets) == 1:          # set가 하나라면 해당 set를 list 형태로 반환
        return list(sets)
    
    for x in sets:              # 각 set에 대해서 해시맵에 set 길이를 key로, set를 value로 등록
        hash_map[len(x)] = x
    
    answer = list(hash_map[1])  # 길이가 1인 set는 튜플의 첫번째 요소
    while True:
        if cursor + 1 not in hash_map:  # cursor가 마지막 set를 가리키면 answer을 반환
            return answer
        
        answer += list(hash_map[cursor+1] - hash_map[cursor])       # (cursor+1) 길이를 가진 set와 cursor 길이를 가진 set의 차집합 = (cursor+1)번째 튜플의 요소
        cursor += 1

'''
여담

re 모듈을 불러와서 정규식 표현으로 처리한 뒤 split 하는 방법도 있겠지만
정규식을 사용하는 방법이 꽤 시간이 걸리는 작업이라고 들었고, hash를 이용해 풀어보고 싶어서 일부로 eval을 이용하였음
다른 사람은 eval을 쓴 사람이 없다는 것에 나름대로 만족함

'''