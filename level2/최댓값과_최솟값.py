'''
연습문제
최댓값과 최솟값
https://programmers.co.kr/learn/courses/30/lessons/12939
'''

def solution(s):
    s = sorted(map(int, s.split(' ')))
    return str(s[0]) + " " + str(s[-1])