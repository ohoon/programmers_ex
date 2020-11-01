'''
2019 KAKAO BLIND RECRUITMENT
오픈채팅방
https://programmers.co.kr/learn/courses/30/lessons/42888
'''

def solution(record):
    user = {}       # uid에 따른 이름 저장소
    log = []

    for r in record:
        cmd = r.split()
        if cmd[0] == "Enter":       # 유저 이름 할당해주고 로그에 기록
            user[cmd[1]] = cmd[2]
            log.append((cmd[0], cmd[1]))
            continue
        
        if cmd[0] == "Change":      # 유저 이름만 할당
            user[cmd[1]] = cmd[2]
            continue
        
        if cmd[0] == "Leave":       # 로그에 기록
            log.append((cmd[0], cmd[1]))
            continue
    
    return [user[l[1]] + "님이 " + ("들어왔습니다." if l[0] == "Enter" else "나갔습니다.") for l in log]        # 로그를 탐색하며 Enter, Leave에 따른 메시지 출력