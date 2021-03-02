'''
월간 코드 챌린지 시즌1
이진 변환 반복하기
https://programmers.co.kr/learn/courses/30/lessons/70129
'''

def solution(s):
    answer = [0, 0]         # [이진 변환 횟수, 제거한 0의 개수]
    
    while s != '1':                         # s가 "1"이 되면 종료
        answer[0] += 1                      # 이진 변환 시작
        answer[1] += s.count('0')           # 제거할 0의 개수
        s = bin(s.count('1'))[2:]           # 0을 제외한 1의 개수를 이진법한 것이 다음 s
        
    return answer