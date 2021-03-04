'''
찾아라 프로그래밍 마에스터
게임 맵 최단거리
https://programmers.co.kr/learn/courses/30/lessons/1844
'''

def solution(maps):
    N, M = len(maps) - 1, len(maps[0]) - 1
    cur = [[0, 0]]
    maps[0][0] = -1
    answer = 1
    
    while [N, M] not in cur:
        next_cur = []
        answer += 1
        
        while cur:
            [i, j] = cur.pop()
            
            if i > 0 and maps[i-1][j] > 0:
                maps[i-1][j] = -1
                next_cur.append([i-1, j])
                
            if j > 0 and maps[i][j-1] > 0:
                maps[i][j-1] = -1
                next_cur.append([i, j-1])
            
            if i < N and maps[i+1][j] > 0:
                maps[i+1][j] = -1
                next_cur.append([i+1, j])
                
            if j < M and maps[i][j+1] > 0:
                maps[i][j+1] = -1
                next_cur.append([i, j+1])
        
        if not next_cur:
            return -1
        
        cur = next_cur
    
    return answer

'''
여담

이 문제를 해결하는 코드는 그다지 어렵지 않게 작성했는데
효율성이 문제여서 시간을 조금 소모했다.
내 코드를 보면서 어떤 작업이 시간을 많이 소모할까 곰곰히 생각해봤는데,
방문한 요소 값을 -1하는 것보다는 다음에 방문할 요소 값을 -1하는 것이 최대 4배정도 효율적이라고 생각이 들었다.
게다가 다음에 방문할 요소들이 중복되는 경우도 존재하기 때문에 불필요한 연산을 많이 한 것이 문제였다.
단번에 맞추지 못해 아쉽지만 그래도 순수하게 내가 문제점을 찾아 고쳐 해결하니 기분이 좋다.

'''