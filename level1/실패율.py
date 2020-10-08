'''
2019 KAKAO BLIND RECRUITMENT
실패율
https://programmers.co.kr/learn/courses/30/lessons/42889
'''

def solution(N, stages):
    failure = {}
    clear = len(stages)
    
    for stage in range(1, N + 1):
        if (clear <= 0):    # 해당 스테이지 클리어율 0
            failure[stage] = 0      # 따라서 실패율 0
            continue
            
        notClear = stages.count(stage)      # 해당 스테이지에 머문 사람 수
        failure[stage] = (notClear / clear)     # 해당 스테이지 실패율: 머문 사람 수 / 클리어한 사람 수
        clear -= notClear       # 머문 사람 수를 클리어 수에서 차감
        
    return sorted(failure, key = (lambda key: failure[key]), reverse = True)        # 실패율을 key값으로 해서 내림차순으로 정렬

'''
다른 사람의 풀이

def solution(N, stages):
    answer = []
    fail = []
    info = [0] * (N + 2)
    for stage in stages:
        info[stage] += 1
    for i in range(N):
        be = sum(info[(i + 1):])
        yet = info[i + 1]
        if be == 0:
            fail.append((str(i + 1), 0))
        else:
            fail.append((str(i + 1), yet / be))
    for item in sorted(fail, key=lambda x: x[1], reverse=True):
        answer.append(int(item[0]))
    return answer

주목할 점은 1 스테이지부터 올라가면서 count로 해당 스테이지에 머문 사람 수를 계산하는 것이 아니라
처음부터 stages를 돌면서 각 stage에 머문 사람 수를 체크해놓고 실패율 계산하는 방법을 채택했다.
count는 O(N)이므로 각 스테이지때마다 count를 반복하므로 O(N*N) 시간복잡도가 소모되는 반면에
위 방법은 대략 O(N) + O(N)와 같기 때문에 시간적으로 코스트가 적다고 볼 수 있다.
'''