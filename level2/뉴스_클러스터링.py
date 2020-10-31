'''
2018 KAKAO BLIND RECRUITMENT
[1차] 뉴스 클러스터링
https://programmers.co.kr/learn/courses/30/lessons/17677
'''

def solution(str1, str2):
    str1, str2 = str1.lower(), str2.lower()
    hash_map = {str1: {}, str2:{}}
    union = 0
    
    if str1 == str2:
        return 65536
    
    for i in range(len(str1) - 1):
        word = str1[i:i+2]
        if not word.isalpha():
            continue
            
        if not word in hash_map[str1]:
            hash_map[str1][word] = 1
            continue
        
        hash_map[str1][word] += 1
    
    for j in range(len(str2) - 1):
        word = str2[j:j+2]
        if not word.isalpha():
            continue
            
        if not word in hash_map[str2]:
            hash_map[str2][word] = 1
            continue
        
        hash_map[str2][word] += 1
    
    set1 = set(hash_map[str1].keys())
    set2 = set(hash_map[str2].keys())
    for x in (set1 & set2):
        union += min(hash_map[str1][x], hash_map[str2][x])
        
    intersect = sum(list(hash_map[str1].values()) + list(hash_map[str2].values())) - union
    
    return int(65536 * union / intersect)

'''
다른 사람의 풀이

from collections import Counter
def solution(str1, str2):
    # make sets
    s1 = [str1[i:i+2].lower() for i in range(len(str1)-1) if str1[i:i+2].isalpha()]
    s2 = [str2[i:i+2].lower() for i in range(len(str2)-1) if str2[i:i+2].isalpha()]
    if not s1 and not s2:
        return 65536
    c1 = Counter(s1)
    c2 = Counter(s2)
    answer = int(float(sum((c1&c2).values()))/float(sum((c1|c2).values())) * 65536)
    return answer

Counter을 이용하면 해시맵을 생성하고 갯수를 세어 등록하는 과정을 생략할 수 있을 것이다.
늘 써봐야지 하고 생각하지만 실상 문제를 풀 때는 고려하지 못한게 아쉽다.
'''