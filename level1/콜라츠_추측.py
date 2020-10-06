'''
연습문제
콜라츠 추측
https://programmers.co.kr/learn/courses/30/lessons/12943
'''

def solution(num):
    answer = 0
    
    while (num > 1):
        if (answer >= 500):
            return -1
        
        answer += 1
        num = num / 2 if num % 2 == 0 else num * 3 + 1
        
    return answer