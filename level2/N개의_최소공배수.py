'''
연습문제
N개의 최소공배수
https://programmers.co.kr/learn/courses/30/lessons/12953
'''

def gcd(m, n):
    if m % n == 0:
        return n
    
    for i in range(n // 2, 0, -1):
        if m % i == 0 and n % i == 0:
            return i
    
def solution(arr):
    while len(arr) > 1:
        m = arr.pop()
        n = arr.pop()
        m, n = (n, m) if n > m else (m, n)
        
        arr.append((m * n) // gcd(m, n))
        
    return arr[0]

'''
다른 풀이

def solution(arr):
    if len(arr) == 1:
        return arr[0]
    
    if len(arr) == 2:
        if max(arr) % min(arr) == 0:
            return max(arr)
        
        for i in range(int(min(arr) // 2), 0, -1):
            if arr[0] % i == 0 and arr[1] % i == 0:
                return (arr[0] * arr[1]) // i
        
    return solution([arr[0], solution(arr[1:])])

재귀법으로 풀이한 것이다.
반복법보다는 시간이 오래 걸려 최종 풀이로 쓰진 않았음

'''