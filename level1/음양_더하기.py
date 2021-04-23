'''
월간 코드 챌린지 시즌2
음양 더하기
https://programmers.co.kr/learn/courses/30/lessons/76501
'''

def solution(absolutes, signs):
    answer = 0
    for num, sign in zip(absolutes, signs):
        if sign:            # 양수면 증가
            answer += num
        else:               # 음수면 감소
            answer -= num

    return answer