'''
정렬
H-Index
https://programmers.co.kr/learn/courses/30/lessons/42747
'''

def solution(citations):
    citations.sort(reverse=True)    # 내림차순 정렬
    length = len(citations)
    h = citations[0]
    
    for i in range(length - 1):
        num = i + 1
            
        while h > citations[i+1]:       # i번째 숫자 >= h > i+1번째 숫자까지 탐색
            if num >= h and length - num <= h:
                return h
            h -= 1
    
    # 마지막 논문의 경우
    return min(length, citations[-1])

'''
다른 사람의 풀이

def solution(citations):
  sorted_citations = sorted(citations, reverse=True)

  for i in range(len(sorted_citations)):
    if sorted_citations[i] <= i: 
      return i

  return len(sorted_citations)

이 문제가 쉬운듯하지만 지문을 이해하기가 워낙 어려워서 코드도 장황해지고 시간도 오래 걸렸던 것 같다..
결국에 h는 citations의 길이 이하라는 사실을 깨달았어야 했는데.. 좀 비효율적으로 코드를 짰다.
알고리즘을 잘 설계하는 것도 중요하지만 문제를 잘 이해하고 간단하게 잘 풀이해가는 것이 중요하다는 것을 새삼 다시 느꼈다.

'''
