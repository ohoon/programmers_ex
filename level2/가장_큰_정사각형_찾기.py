'''
연습문제
가장 큰 정사각형 찾기
https://programmers.co.kr/learn/courses/30/lessons/12905
'''

def solution(board):
    rows = len(board)
    cols = len(board[0])
    maximum = 0
    
    for i in range(rows):
        for j in range(cols):
            # 시작지점 부분은 처리X
            if i == 0 or j == 0:
                maximum = max(board[i][j], maximum)
                continue
            
            # 좌측 상단부터 전개
            if board[i][j] == 1:
                board[i][j] = min(board[i-1][j-1], board[i-1][j], board[i][j-1]) + 1        # board[i][j] = i, j에서 만들 수 있는 최대 사각형 변 길이 = 앞 과정에서 얻는 변 길이 값들의 최소값 + 1
                maximum = max(board[i][j], maximum)
    
    return maximum ** 2

'''
처음에 풀이한 코드

import numpy as np

def solution(board):
    board = np.array(board)
    [rows, cols] = board.shape
    n = min(rows, cols)
    
    while(n > 0):
        for i in range(rows - n + 1):
            for j in range(cols - n + 1):
                if np.all(board[i:i + n, j:j + n] == 1):
                    return n ** 2
        
        n -= 1
    
    return 0

처음에는 n길이의 정사각형을 배열에서 찾는 방법으로 접근했지만 시간복잡도가 n^3에 가까워서
n이 커지면 커질수록 소요되는 시간이 오래걸렸다.
결국 효율성 검사에서 시간 초과가 떠버림..
도저히 모르겠어서 정석 풀이를 보고 어떤 방법을 사용하는지 이해하기로 했다.
사용한 방식은 동적계획법으로, 전체 사각형의 좌측 상단부터 시작해서 board[i][j]를 그 자리에서 만들 수 있는 정사각형의 변 길이로 갱신한다. ([i-1][j], [i][j-1], [i-1][j-1] 자리의 수를 이용하는 방식)
우측 하단으로 점점 넓혀가면서 board[i][j]의 최대값을 찾아 제곱해주면 되는 문제다.
동적계획법이란 걸 알아서 풀이과정이 쉽게 이해가 가지만 몰랐다면 풀이를 생각해내기 어려웠던 문제였던 것 같다.
이 방법을 계속 기억해두고 비슷한 문제를 만나면 동적계획법이 떠오르도록 연습해야할 필요성이 느껴진다.

'''