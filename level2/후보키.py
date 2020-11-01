'''
2019 KAKAO BLIND RECRUITMENT
후보키
https://programmers.co.kr/learn/courses/30/lessons/42890
'''

from itertools import combinations

def solution(relation):
    candidate_key = []
    trans = []
    n = 1
    
    # 배열을 전치시킴
    for row in range(len(relation)):
        for col in range(len(relation[0])):
            if row == 0:
                trans.append([])
            
            trans[col].append(relation[row][col])
    
    while n <= len(trans):
        for pair in combinations(range(len(trans)), n):         # 속성 인덱스들의 조합
            raw = [tu for tu in zip(*[trans[idx] for idx in pair])]     # 인덱스 조합에 해당되는 튜플들을 zip으로 묶어서 배열화
            compress = set(raw) 
            if len(raw) == len(compress):                               # set화 시킨 것과 길이가 같다면 이 조합은 유일성을 만족하는 조합
                p = set(pair)
                for c in candidate_key:                                 # 앞에서 찾은 후보키 조합과 부분집합 관계가 아니라면 최소성도 만족
                    if c.issubset(p):
                        break
                else:                                                   # 찾은 조합을 후보키 조합에 삽입해줌
                    candidate_key.append(p)
                    
        n += 1
            
    return len(candidate_key)

'''
여담

푸는데 2시간정도 걸린 거 같다.
문제를 풀이하면서 너무 복잡해서 머릿속으로 생각한다고 오래 걸렸다.
처음에는 후보키를 찾으면 해당 속성을 소거하는 식으로 전개하면 최소성을 만족시키는 줄 알았는데, 예외사항이 있다는 것을 뒤늦게 알아서 더 늦은 것 같다.
코드도 난잡해서 이게 제대로 맞게 푼 것인지 잘 모르겠지만 결과는 좋게 나왔다.
그나마 위안이라면 이번 문제를 풀면서 zip의 활용성과 사용법을 자세하게 알게된 것 같아 뿌듯하다..!

'''