'''
깊이/너비 우선 탐색(DFS/BFS)
타겟 넘버
https://programmers.co.kr/learn/courses/30/lessons/43165
'''

def solution(numbers, target):
    result = [0]
    for n in numbers:
        temp = []
        for r in result:
            temp.extend([r+n, r-n])
        
        result = temp
        
    return result.count(target)

'''
다른 사람의 풀이

answer = 0
def DFS(idx, numbers, target, value):
    global answer
    N = len(numbers)
    if(idx== N and target == value):
        answer += 1
        return
    if(idx == N):
        return

    DFS(idx+1,numbers,target,value+numbers[idx])
    DFS(idx+1,numbers,target,value-numbers[idx])
def solution(numbers, target):
    global answer
    DFS(0,numbers,target,0)
    return answer

내가 한 방식은 너비 우선 탐색으로 하였다면
윗 사람의 풀이는 깊이 우선 탐색에 가까운 것 같다.
물론 내 코드도 재귀방식으로 표현할 수 있겠지만 우선 떠오르는 것이 반복문을 이용한 방법이었음
dfs방식 풀이도 잘 읽어보고 다음에 써먹어야겠음

'''