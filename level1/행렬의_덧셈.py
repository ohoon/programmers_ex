'''
연습문제
행렬의 덧셈
https://programmers.co.kr/learn/courses/30/lessons/12950
'''

import numpy as np

def solution(arr1, arr2):
    arr1, arr2 = np.array(arr1), np.array(arr2)     # 행렬 덧셈을 위해 numpy의 array으로 변환
    return (arr1 + arr2).tolist()   # 행렬 덧셈 후 list화

'''
다른 사람의 풀이

def solution(arr1,arr2):
    answer = [[c + d for c, d in zip(a, b)] for a, b in zip(arr1,arr2)]
    return answer

원소값을 for문으로 순환하며 찾는거는 충분히 예상 가능했지만
zip을 사용한 for문은 처음 보는거라 흥미로웠다.
저렇게 zip으로 원소쌍을 한번에 하는 방법도 있고
인덱스 길이는 어차피 arr1, arr2가 같으니
한 인덱스 i로 arr1[i] + arr2[i] 처럼 접근해서 푸는 방법도 있을 것이다.
'''