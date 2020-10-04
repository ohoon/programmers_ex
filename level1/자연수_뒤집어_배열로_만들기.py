'''
연습문제
자연수 뒤집어 배열로 만들기
https://programmers.co.kr/learn/courses/30/lessons/12932
'''

def solution(n):
    n = str(n)
    size = len(n)
    
    return [int(n[size - i - 1]) for i in range(size)]

'''
여담

다른 사람들의 풀이를 보면
대부분 배열을 뒤집을 때 reversed를 사용해서 구현했는데
사실 배열을 뒤집는 작업 자체가 코스트가 크다고 들었다.
그래서 내 코드 처럼 인덱스를 뒤에서부터 역으로 참조하여 배열을 만드는게 훨씬 효율적이다.
다른 사람 풀이 둘러보니까 [::-1]를 사용하면 내 코드를 좀 더 간단하게 구현할 수 있는듯

'''