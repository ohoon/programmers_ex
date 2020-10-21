'''
완전탐색
카펫
https://programmers.co.kr/learn/courses/30/lessons/42842
'''

def solution(brown, yellow):
    # 노란 박스의 가로 세로 조합 (x, y) 구하기
    for i in range(1, int(yellow ** 0.5) + 1):
        if yellow % i == 0:
            x = yellow / i
            y = i
            
            if (brown / 2) == x + y + 2:
                return [x + 2, y + 2]           # 갈색 박스의 가로 길이 = 노란 박스 가로 길이 + 2,  갈색 박스의 세로 길이 = 노란 박스 세로 길이 + 2
