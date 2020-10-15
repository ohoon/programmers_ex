'''
2020 KAKAO BLIND RECRUITMENT
문자열 압축
https://programmers.co.kr/learn/courses/30/lessons/60057
'''

def solution(s):
    length = len(s)
    max_comp = 0        # 최대 압축률
    
    for i in range(1, length // 2 + 1):
        j = length // i
        comp = 0        # 각 시도 별 압축률
        repeat = 0      # 중복 횟수

        for item in range(j - 1):
            next_item = item + 1
            if (s[item * i:(item + 1) * i] == s[next_item * i:(next_item + 1) * i]):        # 한 아이템과 바로 다음 아이템이 같으면 중복 횟수 1 증가
                repeat += 1
            else:                                                   # 인접한 두 아이템이 같지 않고 repeat가 0이 아니라면 앞선 아이템들의 중복이 끝난 것이므로 repeat만큼 압축률 증가
                comp += repeat * i - len(str(repeat + 1)) if repeat > 0 else 0
                repeat = 0

        comp += repeat * i - len(str(repeat + 1)) if repeat > 0 else 0              # 마지막 블록 중복 횟수 처리
        max_comp = max(max_comp, comp)          # 최대 압축률 갱신
            
    return length - max_comp        # 총 길이로부터 최대 압축률만큼 뺀 값 반환

'''
여담

1시간 반? 정도에 94%까지 정답률을 기록했는데, 도저히 100%가 안떴다.
10a, 100a, 1000a의 경우도 생각해서 수정했는데 다른 예외의 수가 생각이 안나서
시간을 오래 끌었다.
결론은 내 실수다.. 중복되는 문자열을 나타내는 수의 자리수를 (repeat + 1) // 10 이런식으로 표현해서
100a에 2이어야 하는 것을 20a이 2이고 100a는 10이 되는 기초적이고 결정적인 실수를 범했다.
이 작은 실수로 2시간동안 붙잡고 있다니 너무 허무하다 ㅠㅠㅠ
 
'''
