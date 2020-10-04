'''
연습문제
자릿수 더하기
https://programmers.co.kr/learn/courses/30/lessons/12931
'''

def solution(n):
    answer = 0

    for x in str(n):
        answer += int(x)

    return answer

'''
다른 사람의 풀이

def solution(n):
    if n < 10:
        return n;
    return (n % 10) + solution(n // 10) 

위의 답처럼 재귀식으로 풀 수 있겠지만
n이 만약에 억, 조단위면 스택에 부담이 갈것이라 그리 효율적인 코드는 아닌거같다.
'''