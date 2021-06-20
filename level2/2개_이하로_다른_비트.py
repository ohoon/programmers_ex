'''
월간 코드 챌린지 시즌2
2개 이하로 다른 비트
https://programmers.co.kr/learn/courses/30/lessons/77885
'''

def solution(numbers):
    answer = []
    for num in numbers:
        if num % 2 == 0:                # 짝수이면 바로 다음 수가 해당
            answer.append(num + 1)
            continue
        
        temp = num
        cur = 0
        while temp > 0 and temp % 2 != 0:       # 홀수이면 가장 오른쪽의 0비트 위치를 알아내어 계산
            cur += 1
            temp //= 2
        
        answer.append(num + 2 ** cur - 2 ** (cur - 1))
            
    return answer
