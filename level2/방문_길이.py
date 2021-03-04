'''
Summer/Winter Coding(~2018)
방문 길이
https://programmers.co.kr/learn/courses/30/lessons/49994
'''

def solution(dirs):
    hash_map = {}
    move = {'U': (1, 0), 'D': (-1, 0), 'L': (0, -1), 'R': (0, 1)}       # 방향 별로 바뀌는 xy값
    cur = (0, 0)            # 현재 커서 위치 (y, x)
    
    for d in dirs:
        (y, x) = cur
        (j, i) = move[d]
        
        next_cur = (y + j, x + i)       # 다음 커서 위치
        if next_cur[0] > 5 or next_cur[0] < -5 or next_cur[1] > 5 or next_cur[1] < -5:      # +- 5를 넘어가면 무시하고 다음 move로
            continue
            
        cur = next_cur
        edge = str(y + j/2) + str(x + i/2)          # 해시맵에 등록할 edge를 나타내는 값. 점과 점 사이 중간의 xy값을 표시 (ex: (0, 0) -> (0, 1) = (0, 0.5))
        if edge in hash_map:
            continue
            
        hash_map[edge] = True

    return len(hash_map.keys())                     # edge들의 갯수를 반환