'''
연습문제
최대공약수와 최소공배수
https://programmers.co.kr/learn/courses/30/lessons/12940
'''

def solution(n, m):
    answer = []
    n, m = (m, n) if n > m else (n, m)      # n < m이 되도록 swap
    
    if (m % n == 0):    # ex: 4, 12 -> 4가 최대공약수, 12가 최소공배수
        return [n, m]
        
    for i in range(n - 1, 0, -1):       # 최대공약수 구하기
        if (n % i == 0 and m % i == 0):
            answer.append(i)
            break
            
    for j in range(2, n + 1):       # 최소공배수 구하기
        if ((m * j) % n == 0):
            answer.append(m * j)
            break
                
    return answer

'''
다른 사람의 풀이

def solution(n, m):
    a, b = max(n, m), min(n, m)
    t = 1
    while t > 0:
        t = a % b
        a, b = b, t
    answer = [a, int(n*m/a)]

    return answer

이번의 풀이를 보고 유클리드 호제법이란 공식을 처음 알았다.
최소공배수 = 두 수의 곱 / 최대공약수 라는 공식이다...
n과 m이 작은 수면 상관없지만 큰 수일 경우 loop 횟수가 엄청 커지기 때문에
유클리드 호제법을 이용하면 비용적으로 매우 효율적일거다 ㅠ
다음에 비슷한 유형을 만나면 유클리드 호제법을 이용하자.
'''