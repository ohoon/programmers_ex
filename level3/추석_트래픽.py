'''
2018 KAKAO BLIND RECRUITMENT
[1차] 추석 트래픽
https://programmers.co.kr/learn/courses/30/lessons/17676
'''

from datetime import datetime, timedelta

def solution(lines):
    timeline = []
    answer = 0
    for line in lines:
        split = line.split()
        date = " ".join(split[:2])
        process_time = float(split[2][:-1])     # 처리 시간
        end_time = datetime.strptime(date, '%Y-%m-%d %H:%M:%S.%f')      # datetime의 strptime 함수로 문자열로 된 날짜를 datetime 객체로 변환
        start_time = end_time - timedelta(seconds = process_time - 0.001)       # 응답 완료 시간에서 처리 시간만큼 빼서 시작 시간을 얻음
        timeline.append([start_time, end_time])
    
    for tl in timeline:
        for t in tl:
            limit = t + timedelta(seconds = 0.999)      # 1초 간의 처리량을 파악하기 위해 1초 뒤의 시간을 구함
            process = len(list(filter(lambda x: x[0] <= limit and x[1] >= t, timeline)))        # n초~n+1초 사이에 위치한 datetime 객체를 타임라인에서 찾아서 총 개수를 구함
            if process > answer:        # 처리량의 최대값 구하기
                answer = process
                
    return answer

'''
여담

문제를 어떻게 풀이해가야하나 굉장히 고민을 많이 했고,
datetime 모듈을 처음 사용해봐서 생소한 점이 많았다.
비록 풀이 시간은 많이 걸렸지만, 얻을 수 있었던 점이 많아서 뜻깊은 시간이었다고 생각한다.

'''
