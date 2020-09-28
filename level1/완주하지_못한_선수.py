'''
해시
완주하지 못한 선수
https://programmers.co.kr/learn/courses/30/lessons/42576
'''

def solution(participant, completion):
    answer = ''
    participant_hashmap = dict()
    completion_hashmap = dict()
    
    # Key = [a-z], Key's Value = []
    for i in range(97, 123):
        participant_hashmap[chr(i)] = []
        completion_hashmap[chr(i)] = []
        
    # Key = 이름의 첫 글자(a-z), Key's Value = 이름
    for j in participant:
        participant_hashmap[j[0]].append(j)
        
    for k in completion:
        completion_hashmap[k[0]].append(k)

        
    for l in range(97, 123):
        if (len(participant_hashmap[chr(l)]) > len(completion_hashmap[chr(l)])):    # 해당 알파벳으로 시작하는 사람 중 미완주자 존재
            for m in completion_hashmap[chr(l)]:        # 완주자는 해당 리스트에서 제외
                participant_hashmap[chr(l)].remove(m)
            answer = participant_hashmap[chr(l)][0]     # 완주자를 모두 제외하고 남은 미완주자 한 명
    
    return answer

'''
다른 사람 풀이

1.

import collections

def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer.keys())[0]

딕셔너리를 생성하는 과정을 collections 모듈의 Counter() 함수가 한번에 해준 거에 놀랐음
거기다가 차집합(?) 연산도 지원해서 뺄셈 한번이면 미완주자가 한번에 검출됨..
파이썬에서 지원하는 내장 함수들도 공부를 해야겠음

2.

def solution(participant, completion):
    answer = ''
    temp = 0
    dic = {}
    for part in participant:
        dic[hash(part)] = part
        temp += int(hash(part))
    for com in completion:
        temp -= hash(com)
    answer = dic[temp]

    return answer

내가 보고 감탄한 코드
비록 해쉬 충돌에 민감하고 한 사람만 골라낼 수 있다는게 좀 아쉽지만
문제의 출제 의도와 근접하다고 생각함
참가자들의 이름을 해쉬 함수로 해쉬값을 생성해서 딕셔너리에 넣고
temp에 이 해쉬값을 더해줌
완주자들의 이름을 해쉬 함수로 해쉬값을 생성해서 이를 temp에서 빼주다보면
마지막에 한 사람의 해쉬값이 남게됨!
이 해쉬값으로 앞서 만든 딕셔너리에서 참조하면 미완주자의 이름이 나오게 되는 매직이다.
'''
