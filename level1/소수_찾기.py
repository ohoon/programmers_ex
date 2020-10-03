'''
연습문제
소수 찾기
https://programmers.co.kr/learn/courses/30/lessons/12921
'''

import math

def solution(n):
    answer = 0
    primes = []
    
    for number in range(2, n+1):    # 1은 소수가 아니므로 제외
        isPrime = True      # 소수 체크 플래그

        for p in primes:    # primes: 앞서 찾아낸 소수들 탐색
            if (p > int(math.sqrt(number)) + 1):    # 제곱근 위는 이미 걸러졌기 때문에 탐색할 필요 x
                break
            if (number % p == 0):   # 합성수이면
                isPrime = False
                break

        if (isPrime):   # number이 소수인가?
            primes.append(number)   # 찾은 소수 primes에 추가
            answer += 1
            
    return answer

'''
다른 사람의 풀이

def solution(n):
    num=set(range(2,n+1))

    for i in range(2,n+1):
        if i in num:
            num-=set(range(2*i,n+1,i))
    return len(num)

에라토스테너스의 체를 활용한 알고리즘이라 한다.
2부터 n 사이의 한 값을 x라고 할 때, x의 배수를 2..n의 배열에서 걸러가면
마지막엔 소수들만 남게되는 마법이다.

내 알고리즘도 오랫동안의 고심 끝에 작성한 알고리즘이지만
위의 알고리즘이 더 훌륭하다고 생각한다.
내 알고리즘은 합성수를 검사하는데는 빠르지만, 만약 탐색하는 수 x가 311131처럼 높은 값을 가지는 소수일 때
나머지 연산을 2부터 311131의 제곱근까지 계속 반복하기 때문에 코스트가 커지는 단점이 있는데
위의 방법을 사용하면 단지 배수만을 걸러 나가기 때문에 평균적으로 코스트가 적게 유지된다.

다음에 prime 관련 알고리즘이 나오면 활용할 가치가 있다.
'''