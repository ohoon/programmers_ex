'''
Summer/Winter Coding(~2018)
소수 만들기
https://programmers.co.kr/learn/courses/30/lessons/12977
'''

def solution(nums):
    answer = 0
    maximum = max(nums) * 3     # 세 수를 더해서 만들 수 있는 최댓값
    length = len(nums)

    # 에라토스테레스의 체 이용하여 maximum 까지의 소수 리스트를 구축
    primes = set(range(2, maximum))
    for i in range(2, int(maximum ** 0.5) + 1):
        primes -= set([j for j in range(i * 2, maximum, i)])
    
    # 세 수를 더한 값이 primes에 있으면 개수를 answer에 추가
    for i in range(length):
        for j in range(i + 1, length):
            answer += len(primes & set([(nums[i] + nums[j] + nums[k]) for k in range(j + 1, length)]))
    
    return answer