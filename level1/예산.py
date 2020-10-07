'''
Summer/Winter Coding(~2018)
예산
https://programmers.co.kr/learn/courses/30/lessons/12982
'''

def solution(d, budget):
    answer = 0
    
    for i in sorted(d):
        if (budget < i):
            break
        
        budget -= i
        answer += 1
        
    return answer