'''
연습문제
문자열 내 마음대로 정렬하기
https://programmers.co.kr/learn/courses/30/lessons/12915
'''

def solution(strings, n):
    answer = sorted(sorted(strings), key=lambda s: s[n])
    return answer

'''
여담
다른 사람들도 나처럼 푼 사람이 많던데
사실 sorted 작업을 2번 하는 것은 strings의 배열 크기가 커지면 클수록 코스트가 커져서
key의 lambda식을 key=lambda s: (s[n], s)처럼 수정해서
1차적으로 s[n]으로 정렬을 하고 같은 s[n]으로 정렬한 값들이 있으면
2차적으로 s를 기준으로 정렬하게 하는 코드가 더욱 효율적이라고 생각이 들었다..
'''