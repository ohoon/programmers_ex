'''
월간 코드 챌린지 시즌1
삼각 달팽이
https://programmers.co.kr/learn/courses/30/lessons/68645
'''

def solution(n):
    array = [[0] * i for i in range(1, n + 1)]      # 빈 배열 생성
    cycle = 1       # 삼각패턴 싸이클
    number = 1
    while (n > 0):
        # 왼쪽 변
        for i in range(0, n):
            array[2 * (cycle - 1) + i][cycle - 1] = number
            number += 1

        n -= 1
        
        # 밑 변
        for i in range(0, n - 1):
            array[-cycle][cycle + i] = number
            number += 1
        
        n -= 1
        
        # 오른쪽 변
        for i in range(0, n - 2):
            array[-(cycle + i + 1)][-cycle] = number
            number += 1
        
        n -= 1
        cycle += 1
        
    return sum(array, [])

'''
여담

뭔가 시간 내로 푼 건 같은데
최대 소요 시간이 1000ms대인 것이 마음에 걸린다.
다른 사람들의 풀이는 빠른가 확인해봐도 다들 속도는 비슷한 거 같다.
이 문제는 삼각형 모양의 패턴을 점점 가운데로 줄어가며 반복해서 할당해가는 방법으로 해결했다.
 
'''
