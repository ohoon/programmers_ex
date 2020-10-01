'''
스택/큐
프린터
https://programmers.co.kr/learn/courses/30/lessons/42587
'''

from collections import deque

def solution(priorities, location):
    answer = 0
    priorities = deque(priorities)  # popleft, 즉 큐로써 사용하기 위해 collections의 deque 사용
    
    while (1):
        high_priority = max(priorities) # 뽑아야할 우선순위 수치
        output = priorities[0]  # 현재 작업하는 문서의 우선순위
        priorities.popleft()
        location = location - 1 # 출력하거나 안하거나 어차피 큐에서 삭제되기 때문에 작업 문서의 인덱스 - 1
        
        if (output != high_priority):   # 작업하는 문서의 우선 순위가 제일 높지 않을 때
            priorities.append(output)   # 중요한 문서가 아니기 때문에 큐의 제일 끝으로 미룸
            if (location < 0):  # 미룬 문서가 목표로 한 문서일 경우
                location = len(priorities) - 1  # location(목표 문서의 인덱스)를 제일 끝으로 재설정
            continue

        answer = answer + 1 # 우선 순위가 높은 문서를 출력했으므로 출력 횟수 + 1
        if (location < 0):  # 목표 문서를 출력했음 -> while문 종료
            break


    return answer