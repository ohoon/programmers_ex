'''
2018 KAKAO BLIND RECRUITMENT
[3차] 파일명 정렬
https://programmers.co.kr/learn/courses/30/lessons/17686
'''

def custom_key(x):
    num_start = -1      # NUMBER 시작 인덱스
    num_end = -1        # NUMBER 종료 인덱스
    length = len(x)
    for i in range(length):
        if num_start == -1 and x[i].isdigit():
            num_start = i
        
        if num_start != -1 and (i == length - 1 or not x[i+1].isdigit() or i - num_start == 4):     # 현재 인덱스가 문자열의 끝인 경우, 다음 문자가 숫자가 아닌 경우, 5개의 연속된 숫자를 지나친 경우에 NUMBER 종료 인덱스 기록
            num_end = i + 1
            break
    
    return (x[:num_start].lower(), int(x[num_start:num_end]))       # HEAD 부분은 lower()로 소문자 통일, NUMBER 부분은 int로 정수화해서 처리

def solution(files):
    return sorted(files, key = custom_key)

'''
여담

정규식을 쓰려다가 sorted의 key에 함수를 배정하는 방법이 생각나서 풀이해봤다.
isdigit을 활용해서 number부분의 인덱스 값을 알아내어 head와 number을 key로 sort했다.

'''