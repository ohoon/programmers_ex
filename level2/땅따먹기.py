'''
연습문제
땅따먹기
https://programmers.co.kr/learn/courses/30/lessons/12913
'''

def solution(land):
    # 동적 계획법
    for i in range(1, len(land)):
        # 바로 이전 행에서 같은 열을 제외한 값들의 최댓값을 더해주며 전개함
        land[i][0] += max(land[i-1][1], land[i-1][2], land[i-1][3])
        land[i][1] += max(land[i-1][0], land[i-1][2], land[i-1][3])
        land[i][2] += max(land[i-1][0], land[i-1][1], land[i-1][3])
        land[i][3] += max(land[i-1][0], land[i-1][1], land[i-1][2])
    
    return max(land[-1])    # 제일 마지막 행에서 가장 큰 값 = 마지막 행까지 내려오면서 얻을 수 있는 최대 점수

'''
여담

힌트를 보기 전까지 풀이 과정을 바로 떠올릴 수 없어서 아쉽지만
처음 동적 계획법 문제를 만났을 때보다는 빠르게 이해하고 풀이할 수 있었다.
비슷한 문제를 많이 접해서 점점 익숙해지도록 노력해야겠다.
'''