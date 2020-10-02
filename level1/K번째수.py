'''
정렬
K번째수
https://programmers.co.kr/learn/courses/30/lessons/42748
'''

def solution(array, commands):
    answer = []
    for command in commands:    # 각 작업에 대해서
        answer.append(sorted(array[command[0]-1:command[1]])[command[2]-1]) # 슬라이싱 작업 -> 정렬 -> 인덱스참조
    return answer
