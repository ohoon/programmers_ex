'''
탐욕법(Greedy)
체육복
https://programmers.co.kr/learn/courses/30/lessons/42862
'''

def solution(n, lost, reserve):
    answer = n  # 모든 사람이 체육활동이 가능하다고 가정
    lost_copy = list(lost)  # 인덱스 참조 오류 예방용
    for lc in lost_copy:
        if (lc in reserve): # 잃어버린 체육복이 여분의 체육복인 경우
            lost.remove(lc)
            reserve.remove(lc)
            
    for l in lost:
        if (l-1 in reserve):    # 자신의 번호-1 인 사람한테 빌리기
            reserve.remove(l-1)
        elif (l+1 in reserve):  # 자신의 번호+1 인 사람한테 빌리기
            reserve.remove(l+1)
        else:
            answer = answer - 1 # 못빌리는 경우에는 체육 가능한 사람 - 1
    return answer

'''
여담
사실 이 문제를 해결하는데 시간을 많이 썼다.
이유는 lost를 순환하면서 reserve에 포함된거면 remove를 하는데,
remove를 하면 for in 작업에서 index가 감소되어서 바로 다음 인덱스를 탐색하지 않는 문제점이 있었다.
그래서 수많은 고민 끝에 탐색용 lost_copy를 만들어놓고 탐색용으로만 사용하고 실제 remove되는 것은 lost 배열인 것으로 해서
인덱스 참조 오류를 해결했다!
'''
