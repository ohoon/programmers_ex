'''
월간 코드 챌린지 시즌1
두 개 뽑아서 더하기
https://programmers.co.kr/learn/courses/30/lessons/68644
'''

def solution(numbers):
    answer = []

    for i in range(len(numbers)):   # 앞에서 부터 한 쌍씩 탐색
        for j in range(i+1, len(numbers)):
            answer.append(numbers[i]+numbers[j])
        
    answer = list(set(answer))  # 중복을 제거하기 위해 set 사용
    answer.sort()   # 오름차순 정렬

    return answer