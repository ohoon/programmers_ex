'''
힙(Heap)
더 맵게
https://programmers.co.kr/learn/courses/30/lessons/42626
'''

import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)     # minheap으로 변환
    
    while len(scoville) > 1:    # 한 요소가 남을 때까지 반복
        if scoville[0] >= K:    # 첫 요소(최소 매운 값)이 K 이상이면 성공, answer 반환
            return answer
        first = heapq.heappop(scoville)     # 가장 덜 매운 정도
        second = heapq.heappop(scoville)    # 2번째로 덜 매운 정도
        mix = first + second * 2
        heapq.heappush(scoville, mix)       # 섞은 매운 값 삽입 (자동으로 오름차순 순서에 맞게 삽입)
        answer += 1
        
    if scoville[0] >= K:        # 마지막까지 남은 요소가 K 이상이면 성공, answer 반환
        return answer
                    
    return -1       # K 이상 만들기 실패

'''
여담

heapq 모듈을 알고 있으면 참 쉽게 풀리는 문제다.
처음엔 queue를 사용해서 mix한 결과값들을 오름차순으로 정렬해서 사용할려고 했음
문제 유형이 heap라길래 queue/stack문제와 뭐가 다른가 곰곰히 생각해보다가
이 매운 정도가 들어있는 리스트가 오름차순으로 정렬되어 있다는 전제 조건이 없는 것을 확인했다.
최소 매운값을 추출하려면 오름차순 정렬이 필수일텐데 그렇다고 sort를 쓰자니 찜찜해서 찾아보니
minheap을 구현할 수 있게 도와주는 heapq 모듈이 있었다.
2진 트리로 구성되어 있어서 하나의 값이 push되면 2진 트리를 따라서 자동으로 오름차순으로 삽입된다.
heapq를 쓰자고 결정하고 문제를 보니 너무 간단했음.. 그냥 heapq와 같은 모듈을 잘 알고 있냐가 출제자의 의도인 것 같다.

'''
