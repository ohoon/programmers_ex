'''
연습문제
문자열을 정수로 바꾸기
https://programmers.co.kr/learn/courses/30/lessons/12925
'''

def solution(s):
    return int(s)

'''
다른 사람의 풀이

def solution(s):
    result = 0

    for idx, number in enumerate(s[::-1]):
        if number == '-':
            result *= -1
        else:
            result += int(number) * (10 ** idx)

    return result

문제 해결만 보자면 int 형변환으로 끝이 나는 문제지만
출제자의 의도를 보면 이 풀이가 맞는거 같다.
기존의 함수를 잘 사용하는 것도 중요하지만
함수 없이 직접 구현하는 연습도 열심히 해야겠다고 느꼈음..
'''