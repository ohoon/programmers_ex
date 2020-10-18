'''
해시
전화번호 목록
https://programmers.co.kr/learn/courses/30/lessons/42577
'''

def solution(phone_book):
    phone_book.sort(key=lambda x: len(x))       # 짧은 전화번호부터 오도록 정렬
    hash_map = {}
    for x in phone_book:
        hash_map[x] = 1         # 해당 전화번호 해쉬 테이블에 저장
        for i in range(1, len(x)):
            if x[:i] in hash_map:           # 앞부터 점점 넓혀가며 해쉬 테이블에 있는지 검사, 있으면 false 반환
                return False
        
    return True

'''
여담

출제 유형이 해시라 해시를 이용해서 풀었음
처음에 떠오른 생각은 오름차순 정렬을 해서 startwith 함수로 짧은 시간 내에 접두사 가지고 있는지 검사하는 것이었는데, (다른 사람 풀이에는 저 로직처럼 많이 풀으셨더라)
해시에 비해서 시간 복잡도도 오래 걸릴 것이기 때문에 그렇게 풀진 않았다.

'''
