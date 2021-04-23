'''
동적계획법(Dynamic Programming)
N으로 표현
https://programmers.co.kr/learn/courses/30/lessons/42895
'''

def solution(N, number):
    def calc(N, number, current, count):
        if count > 8:
            return float("inf")

        if current == number:
            return count

        res = float("inf")
        M = N
        for i in range(1, 9):
            res1 = calc(N, number, current + M, count + i)
            res2 = calc(N, number, current - M, count + i) if current > M else calc(N, number, M - current, count + i)
            res3 = calc(N, number, current * M, count + i) if current > 0 else float("inf")
            res4 = calc(N, number, current // M, count + i) if current % M == 0 else (calc(N, number, current // M, count + i) + calc(N, number, current % M, count + i))
            res = min(res1, res2, res3, res4, res)
            M = M * 10 + N

        return res

    answer = calc(N, number, 0, 0)
    return answer if answer <= 8 else -1

'''
여담

속도도 그렇고 풀이시간도 엄청 오래걸려서 거의 못푼 것이나 다름없다...
일단 정석 풀이를 보고 이해하는 것이 우선일듯

'''
