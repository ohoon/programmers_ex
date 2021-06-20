'''
월간 코드 챌린지 시즌2
약수의 개수와 덧셈
https://programmers.co.kr/learn/courses/30/lessons/77884
'''

def solution(left, right):
    answer = (right * (right + 1) - left * (left - 1)) / 2      # left부터 right까지 모든 수의 합
    for i in range(1, 40):
        num = i ** 2                                            # left와 right 사이에 있는 제곱수는 덧셈이 아니라 뺄셈을 하여야 함
        if (left <= num <= right):
            answer -= 2 * num
    return answer
    
