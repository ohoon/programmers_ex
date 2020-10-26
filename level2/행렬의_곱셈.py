'''
연습문제
행렬의 곱셈
https://programmers.co.kr/learn/courses/30/lessons/12949
'''

def solution(arr1, arr2):
    answer = []
    hash_map = {}

    # i*j 행렬을 j*i 행렬로 전치
    for i in range(len(arr2)):
        for j in range(len(arr2[0])):
            if not j in hash_map:
                hash_map[j] = []
                
            hash_map[j].append(arr2[i][j])

    # arr1와 전치행렬을 zip으로 묶어 곱셈 연산
    for X in arr1:
        elem = []
        for Y in hash_map.values():
            s = 0
            for x, y in zip(X, Y):
                s += x * y
                
            elem.append(s)
            
        answer.append(elem)
    
    return answer

'''
여담

numpy array을 안쓰고 구현하려고 애를 썼다.
전치 시키는 과정은 zip(*arr2)을 하면 간단하게 구현할 수 있다고 함

'''