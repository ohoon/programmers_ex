'''
Summer/Winter Coding(~2018)
배달
https://programmers.co.kr/learn/courses/30/lessons/12978
'''

from heapq import heappush, heappop

def solution(N, road, K):
    road_map = {}
    route = {node: float('inf') for node in range(1, N + 1)}        # 1에서부터 다른 노드까지의 최단 거리
    route[1] = 0        # 자기 자신이므로
    
    heap = []           # 현재 노드에서 가장 가까운 노드를 알기 위해 최소힙 사용
    heappush(heap, [0, 1])      # [이동거리, 목표 노드]
    
    for r in road:          # 우선 정의된 도로 변수 값들로 전체적인 road_map을 구축
        [i, j, w] = r       # i에서 j까지의 가중치 w
        if i not in road_map:
            road_map[i] = {}
        
        if j not in road_map:
            road_map[j] = {}
            
        if j in road_map[i]:
            min_w = min(road_map[i][j], w)
            road_map[i][j] = min_w
            road_map[j][i] = min_w
        else:
            road_map[i][j] = w
            road_map[j][i] = w
    
    while heap:             # road_map의 데이터를 기반으로 각 노드에서 가장 가까운 노드로 이동하면서 route 변수를 완성시켜감
        [dist, node] = heappop(heap)
        
        if route[node] < dist:
            continue
        
        for arrival, weight in road_map[node].items():
            distance = dist + weight                    # 해당 노드를 거쳐 arrival로 이동하는 총 이동거리
            if distance < route[arrival]:               # 위에서 구한 이동거리와 지금까지 구한 1에서 arrival까지의 최단 거리 비교
                route[arrival] = distance
                heappush(heap, [distance, arrival])
    
    return len([x for x in route.keys() if route[x] <= K])

'''
여담

다익스트라 알고리즘을 사용해야 한다는 건 알고 있었지만
예전 알고리즘 수업 때에만 배우고 써본 적이 없어서 차마 손을 대지 못했다.
그래서 인터넷을 뒤지면서 참고를 많이 했고 구현은 비교적 쉽게 성공했다.
다익스트라 알고리즘... 유명하지만 잘 쓰이지 않는 개념이라 공부를 소홀히 하고 있음을 다시 느꼈다.
이번 기회에 꼭 머리에 새겨서 다음에는 안보고 작성할만큼 익혀야겠다.

'''