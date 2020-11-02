'''
2018 KAKAO BLIND RECRUITMENT
[3차] 방금그곡
https://programmers.co.kr/learn/courses/30/lessons/17683
'''

def sharpToLower(m):
    return m.replace('C#', 'c').replace('D#', 'd').replace('F#', 'f').replace('G#', 'g').replace('A#', 'a')

def solution(m, musicinfos):
    musicinfos = [x.split(',') for x in musicinfos]
    m = sharpToLower(m)
    radio = []
    
    for info in musicinfos:
        startTime = list(map(int, info[0].split(':')))
        endTime = list(map(int, info[1].split(':')))
        dur = abs((endTime[0] - startTime[0]) * 60 + (endTime[1] - startTime[1]))
        melody = sharpToLower(info[3])
        radio_melody = melody * (dur // len(melody)) + melody[:dur % len(melody)]
        radio.append([info[2], radio_melody, dur])
    
    candidate = list(filter(lambda x: x[1].find(m) > -1, radio))
    if not candidate:
        return "(None)"
    
    return sorted(candidate, key=lambda x: -x[2])[0][0]

'''
여담

괜히 처음에 정규식으로 원활하게 풀다가 예시 테스트케이스는 잘 통과하길래 된 줄 알았는데, 제출하니 8개 정도의 테스트케이스 에러가 떠서
문제점을 찾는다고 1시간정도 삽만 팠던 거 같다..
정규식 대신에 replace로 로직을 바꾸니 바로 성공... ㅠㅠㅠ
정규식 식을 [A-G]#? 이런식으로 짰는데 뭔가 문제가 있었나보다.

'''