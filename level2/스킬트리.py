'''
Summer/Winter Coding(~2018)
스킬트리
https://programmers.co.kr/learn/courses/30/lessons/49993
'''

from collections import deque

def solution(skill, skill_trees):
    answer = 0
    
    for st in skill_trees:      # 각 스킬셋에 대해서
        skill_copy = deque(skill)       # 참고할 스킬트리 사본 생성
        for s in st:        # 해당 스킬셋의 각 스킬에 대해서
            if (s in skill_copy):   # 스킬트리에 속한 스킬이면
                if (s != skill_copy[0]):    # 다른 선행 스킬이 요구되면 잘못된 스킬셋
                    break
                    
                skill_copy.popleft()    # 이미 선행 스킬이 만족되었다면 스킬트리 사본에서 pop
        else:
            answer += 1     # 성공적으로 스킬셋 탐색이 끝나면 answer 증가
    
    return answer

'''
여담

처음엔 boolean 값으로 스위치를 써서 풀었는데
파이썬에서 제공하는 for-else문이 있다는걸 알고 사용했다.
 
'''
