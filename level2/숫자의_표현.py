'''
연습문제
숫자의 표현
https://programmers.co.kr/learn/courses/30/lessons/12924
'''

def solution(n):
    answer = 1
    
    for i in range(n, 0, -1):
        res = i         # 누적값
        j = i - 1       # 다음에 더할 연속적인 수
        
        while res < n and j > 0:        # 누적값이 n을 넘으면 반복문 종료
            res += j
            j -= 1
            
            if res == n:        # 누적값이 n과 같으면 answer에 1 추가하고 다른 가능성 탐색
                answer += 1
                break
            
    return answer

'''
다른 사람의 풀이

def expressions(num):
    return len([i  for i in range(1,num+1,2) if num % i is 0])

이 분은 등차수열의 합 공식을 이용해서 풀이한 것 같다.

'''