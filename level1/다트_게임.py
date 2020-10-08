'''
2018 KAKAO BLIND RECRUITMENT
[1차] 다트 게임
https://programmers.co.kr/learn/courses/30/lessons/17682
'''

import re

def solution(dartResult):
    pattern = re.compile('[0-9]+[SDT]+[*#]?')       # 다트 첫 시도 ~ 마지막 시도 별로 분리하기 위한 정규식
    result = pattern.findall(dartResult)
    pointSum = [0, 0, 0]        # 각 시도 별 점수
    
    for i, res in enumerate(result):
        idx = re.search('[SDT]', res).start()       # 보너스 문자의 인덱스를 기준으로
        point = int(res[:idx])      # 보너스 문자 전까지 기본 점수
        bonus = res[idx]        # 보너스 문자
        option = res[idx + 1] if idx < len(res) - 1 else ''     # 보너스 문자 다음인 옵션, 없으면 빈칸
        
        if (bonus == 'D'):
            point = point ** 2
        
        if (bonus == 'T'):
            point = point ** 3
        
        if (option == '*'):
            point *= 2
            if (i > 0):     # 첫 시도가 아니면
                pointSum[i - 1] *= 2    # 바로 전 시도 점수 * 2
            
        if (option == '#'):
            point *= -1
            
        pointSum[i] = point
        
    return sum(pointSum)

'''
다른 사람의 풀이

import re
def solution(dartResult):
    bonus = {'S' : 1, 'D' : 2, 'T' : 3}
    option = {'' : 1, '*' : 2, '#' : -1}
    
    p = re.compile('(\\d+)([SDT])([*#]?)')
    dart = p.findall(dartResult)

    for i in range(len(dart)):
        if dart[i][2] == '*' and i > 0:
            dart[i-1] *= 2

        dart[i] = int(dart[i][0]) ** bonus[dart[i][1]] * option[dart[i][2]]

    return sum(dart)

앞의 정수가 2자리(10)이 될 수 있다는 조건 때문에 인덱싱 처리에 골치가 아팠는데
애초에 정규식을 쓸 때 괄호로 묶으면 배열로 처리해주는지 뒤늦게 알았다.. ㅠㅠㅠㅠ
그리고 bonus랑 option 점수 처리도 그냥 dict로 편하게 할걸 if문을 주렁주렁 단 모습이 마음에 들지 않았다.
정규식을 쓰는건 이번이 처음이라 많이 힘들었는데 정규식도 많이 공부해둬야겠다.
'''