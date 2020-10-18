'''
완전탐색
소수 찾기
https://programmers.co.kr/learn/courses/30/lessons/42839
'''

import itertools

def solution(numbers):
    arr = set()
    max_number = int("".join(sorted(numbers, reverse=True)))        # 만들 수 있는 가장 큰 수, 에라토스테네스 체의 탐색 범위에 쓰임
    
    # 순열을 이용해 만들 수 있는 수의 집합을 생성, 중복 제거를 위해 집합을 사용함
    for i in range(1, len(numbers) + 1):
        arr = arr | set([int("".join(x)) for x in itertools.permutations(numbers, i)])
        
    arr -= set([0, 1])      # 0, 1은 소수가 아니므로 미리 제거
    
    # 에라토스테네스의 체로 arr에서 소수가 아닌 수 제거
    for i in range(2, max_number + 1):
        for j in range(i * 2, max_number + 1, i):
            if j in arr:
                arr -= set([j])
    
    return len(arr)

'''
여담

주어진 숫자들로 만들 수 있는 숫자들을 순열로 구한 다음,
에라토스테네스의 체 기법으로 소수가 아닌 숫자들을 걸러내는 로직으로 풀이했음

'''
