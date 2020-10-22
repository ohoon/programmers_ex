'''
월간 코드 챌린지 시즌1
쿼드압축 후 개수 세기
https://programmers.co.kr/learn/courses/30/lessons/68936
'''

def is_united(arr):             # 같은 수로 이루어져 있는가?
    for y in arr:
        for x in y:
            if x != arr[0][0]:
                return False
    
    return True

def quad_slice(arr):            # 4부분으로 나눠서 튜플 형태로 반환
    length = len(arr)
    half = length // 2
    w = []
    x = []
    y = []
    z = []
    
    for i in range(half):
        w.append(arr[i][:half])
        x.append(arr[i][half:])
    
    for j in range(half, length):
        y.append(arr[j][:half])
        z.append(arr[j][half:])
    
    return (w, x, y, z)

def solution(arr):
    if is_united(arr):                  # 같은 수로 이루어져 있으면 압축
        return (1, 0) if arr[0][0] == 0 else (0, 1)
    
    w, x, y, z = quad_slice(arr)        # 4개로 나눠진 배열들
    
    return [sum(elem) for elem in zip(solution(w), solution(x), solution(y), solution(z))]      # 4부분 나눈 배열로 재귀적 선언, (0의 개수, 1의 개수)의 합 반환

'''
다른 사람의 풀이

import numpy as np

def solution(arr):
    # 재귀함수 구현
    def fn(a):
        if np.all(a == 0): return np.array([1, 0])
        if np.all(a == 1): return np.array([0, 1])
        n = a.shape[0]//2
        return fn(a[:n, :n]) + fn(a[n:, :n]) + fn(a[:n, n:]) + fn(a[n:, n:])

    # 결과 리턴
    return fn(np.array(arr)).tolist()

위의 코드처럼 numpy.array를 이용하면 코드가 간결해진다.
나도 array를 이용해서 풀까 했지만 라이브러리 없이 풀어보고 싶었다.

'''