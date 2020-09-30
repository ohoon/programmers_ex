'''
완전탐색
모의고사
https://programmers.co.kr/learn/courses/30/lessons/42840
'''

import numpy as np

def solution(answers):
    answer = []
    question_length = len(answers)
    pattern = [[1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]

    # 배열 요소 간의 뺄셈을 위해 numpy.array 사용
    answers = np.array(answers)
    player1 = np.array(pattern[0] * int(question_length / 5) + pattern[0][:question_length % 5])    # 각 문제의 답을 자신의 패턴대로 고른 답안지
    player2 = np.array(pattern[1] * int(question_length / 8) + pattern[1][:question_length % 8])
    player3 = np.array(pattern[2] * int(question_length / 10) + pattern[2][:question_length % 10])

    result = [list(answers - player1).count(0), list(answers - player2).count(0), list(answers - player3).count(0)]     # 정답과 답안지의 답이 같은 경우 = 0 -> 0의 개수 = 정답 개수
    top_result = max(result)    # 최다 득점자의 정답 수

    for i in range(3):      # 최다 득점자 조회
        if (result[i] == top_result):
            answer.append(i+1)

    return answer