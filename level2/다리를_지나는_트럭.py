'''
스택/큐
다리를 지나는 트럭
https://programmers.co.kr/learn/courses/30/lessons/42583
'''

from collections import deque

def solution(bridge_length, weight, truck_weights):
    timer = 0
    standby = deque(truck_weights)      # 다리 건너지 않은 트럭들
    moving = deque()        # 다리 건너고 있는 트럭들
    startTime = deque()         # 한 트럭이 다리 건너기 시작한 시점
    moved = []      # 다리 건넌 트럭들
    
    while(moved != truck_weights):      # 모든 트럭이 다리를 건너지 않았다면 계속 반복
        timer += 1
        if (moving and timer - startTime[0] >= bridge_length):      # 다리를 건너고 있는 트럭이 있고, 다리를 건너기 시작한 시점부터 현재까지의 시간이 다리 길이보다 크면 (= 다리를 다 건넜으면)
            popped = moving.popleft()
            startTime.popleft()
            moved.append(popped)
            weight += popped        # 다리를 건넜으므로 트럭 무게만큼 허용 중량은 증가
            
        if (standby and weight >= standby[0]):      # 다리 건너기 대기 중이고, 대기 중인 트럭 무게가 허용 중량 안이라면
            popped = standby.popleft()
            moving.append(popped)
            startTime.append(timer)     # 다리를 건너기 시작한 시간 저장
            weight -= popped
            
    return timer

'''
여담

짧은 시간 내에 큐를 사용하는 방법으로 풀이를 잘 해낸거 같아 기쁘다!
최대한 popleft와 append만을 이용해서 문제를 푸려고 노력했고
생각한대로 프로그램이 잘 굴러가서 다행이다..!
다른 사람 코드에도 꿀리지 않는 이해하기 쉽고 빠르다고 생각한다.
 
'''
