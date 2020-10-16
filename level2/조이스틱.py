'''
탐욕법(Greedy)
조이스틱
https://programmers.co.kr/learn/courses/30/lessons/42860
'''

# 커서로부터 왼쪽 방향으로 탐색, A가 아닌 문자 발견 시 움직인 거리 반환
def find_left(name, cursor):
    index = cursor
    
    while True:
        index = index - 1
        if (name[index % len(name)] != 'A'):
            break
    
    return abs(cursor - index)

# 커서로부터 오른쪽 방향으로 탐색, A가 아닌 문자 발견 시 움직인 거리 반환
def find_right(name, cursor):
    index = cursor
    
    while True:
        index += 1
        if (name[index % len(name)] != 'A'):
            break
    
    return abs(cursor - index)

def solution(name):
    answer = 0
    cursor = 0
    name = list(name)
    length = len(name)
    
    while (name != ['A'] * length):     # 전부 A로 대체되면 종료
        if (name[cursor] != 'A'):   # A가 아닌 문자를 만나면, A로 만들기 위한 조이스틱 조작 횟수를 구해서 answer에 추가시키고 A로 대체
            answer += min(ord(name[cursor]) - ord('A'), ord('Z') - ord(name[cursor]) + 1)
            name[cursor] = 'A'
            continue
            
        left = find_left(name, cursor)      # 왼쪽 방향에서 가장 가까운 A 아닌 문자까지의 거리
        right = find_right(name, cursor)    # 오른쪽 방향에서 가장 가까운 A 아닌 문자까지의 거리
        if (left < right):      # 왼쪽이 더 가깝다면, 커서 옮기고 이동 횟수만큼 answer에 추가
            cursor = (cursor - left) % length
            answer += left
        else:                   # 오른쪽이 더 가깝다면, 커서 옮기고 이동 횟수만큼 answer에 추가
            cursor = (cursor + right) % length
            answer += right
        
    return answer

'''
여담

1시간 가량 걸렸으며 수월하게 푼 편인듯
좀 더 빠르게 생각해서 코딩할 필요성을 느낀다.
 
'''
