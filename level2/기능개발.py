'''
스택/큐
기능개발
https://programmers.co.kr/learn/courses/30/lessons/42586
'''

from collections import deque

def solution(progresses, speeds):
    answer = []
    progresses = deque(progresses)
    speeds = deque(speeds)
    days = 1        # n일차
    deploy = 0      # 동시 배포 수
    
    while (progresses):
        if progresses[0] + speeds[0] * days >= 100:     # 진행도 + 진척도(일일 수행 정도 * n일)가 100이 넘으면 배포
            progresses.popleft()
            speeds.popleft()
            deploy += 1
            continue        # 다음 작업도 배포 준비 상태일수도 있으니 배포할 게 없을 때까지 반복
        
        if (deploy > 0):        # 배포 준비된게 없고, 배포한 내역들이 있으면
            answer.append(deploy)
            deploy = 0
        
        days += 1
        
    answer.append(deploy)       # 마지막 작업의 배포가 끝났을 때 answer에 마지막 배포 내역 추가
            
    return answer

'''
여담

다리를 지나는 트럭 문제와 유사한 거 같다.
수월하게 큐를 사용해서 잘 풀었고, 자신감이 붙는거 같다!!
 
'''
