'''
연습문제
같은 숫자는 싫어
https://programmers.co.kr/learn/courses/30/lessons/12906
'''

def solution(arr):
    answer = []
    for elem in arr:
        if (len(answer) > 0 and answer[-1] == elem):     # answer의 마지막 원소가 elem와 같을 때, 즉 연속으로 같은 값이 나올 때
            continue
        answer.append(elem)
    return answer