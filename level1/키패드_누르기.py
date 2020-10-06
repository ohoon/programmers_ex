'''
2020 카카오 인턴십
키패드 누르기
https://programmers.co.kr/learn/courses/30/lessons/67256
'''

def solution(numbers, hand):
    answer = ''
    keypad = { 1: [0, 0], 2: [1, 0], 3: [2, 0], 4: [0, 1], 5: [1, 1], 6: [2, 1],
              7: [0, 2], 8: [1, 2], 9: [2, 2], '*': [0, 3], 0: [1, 3], '#': [2, 3] }    # 각 버튼들의 위치값 x, y
    cursor = ['*', '#']     # 현재 손가락 위치
    
    for n in numbers:
        if (n in [1, 4, 7]):    # 키패드 좌측
            cursor[0] = n
            answer += "L"
            continue
            
        if (n in [3, 6 ,9]):    # 키패드 우측
            cursor[1] = n
            answer += "R"
            continue
            
        # 키패드 중앙
        distance = [ abs(keypad[n][0] - keypad[cursor[0]][0]) + abs(keypad[n][1] - keypad[cursor[0]][1]),
                   abs(keypad[n][0] - keypad[cursor[1]][0]) + abs(keypad[n][1] - keypad[cursor[1]][1]) ]    # 입력값과 현재 위치의 거리 [왼쪽 손, 오른쪽 손]

        if (distance[0] < distance[1]):     # 왼쪽 손이 더 가까우면
            cursor[0] = n
            answer += "L"
            continue
            
        if (distance[0] > distance[1]):     # 오른쪽 손이 더 가까우면
            cursor[1] = n
            answer += "R"
            continue
            
        # 왼쪽 오른쪽 둘 다 가까우면
        if (hand == "left"):    # 왼손잡이면
            cursor[0] = n
            answer += "L"
            continue
            
        if (hand == "right"):   # 오른손잡이면
            cursor[1] = n
            answer += "R"
            continue
    
    return answer