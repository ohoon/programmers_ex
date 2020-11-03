'''
2018 KAKAO BLIND RECRUITMENT
[3차] 압축
https://programmers.co.kr/learn/courses/30/lessons/17684
'''

def solution(msg):
    answer = []
    hash_map = {}
    insert_num = 27
    start = 0
    
    for i, x in enumerate(range(ord('A'), ord('Z') + 1)):       # A-Z의 키와 1-26의 값을 갖는 해시맵 생성
        hash_map[chr(x)] = i + 1
    
    while start < len(msg):         # msg 앞에서부터 탐색
        end = start + 1
        while end <= len(msg):      # start부터 msg 끝까지 탐색
            if not msg[start:end] in hash_map:
                break
                
            end += 1
            
        answer.append(hash_map[msg[start:end-1]])       # 해시맵에 없는 새로운 문자열의 경우, 그 전 문자열을 해시에서 찾아 해당 값을 answer에 기록
        hash_map[msg[start:end]] = insert_num           # 새로운 문자열을 해시에 등록
        insert_num += 1
        start = end - 1     # end - 1을 start로 다시 탐색

    return answer