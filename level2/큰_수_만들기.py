'''
탐욕법(Greedy)
큰 수 만들기
https://programmers.co.kr/learn/courses/30/lessons/42883
'''

def find_maximum(partial):      # partial에서 가장 큰 값의 인덱스를 반환
    for i in range(9, -1, -1):      # 9 > 8 > ... > 0 순으로 체크
        num = str(i)
        if num in partial:
            return partial.index(num)
        
def solution(number, k):
    answer = []
    length = len(number)
    cursor = 0
    
    while k > 0:
        if cursor >= length - k:        # cursor 다음에 k개의 숫자가 있어 나머지를 모두 잘라내야 하는 경우
            return "".join(answer)
        
        partial = number[cursor : cursor + k + 1]       # cursor로부터 0 ~ k에 해당하는 숫자들
        max_index = cursor + find_maximum(partial)
        
        # cursor 자신이 최대값이면 answer에 추가하고 다음 숫자로 이동
        if cursor == max_index:
            answer.append(number[cursor])
            cursor += 1
            continue

        # cursor보다 큰 값이 있으면 해당 값을 answer에 추가하고 최대값 다음 숫자로 이동
        answer.append(number[max_index])
        k -= max_index - cursor
        cursor = max_index + 1
        
    # k개의 수를 잘라내고 나머지 숫자들은 answer에 삽입
    if cursor != length:
        answer.append(number[cursor:])
        
    return "".join(answer)

'''
다른 사람의 풀이

def solution(number, k):
    stack = [number[0]]
    for num in number[1:]:
        while len(stack) > 0 and stack[-1] < num and k > 0:
            k -= 1
            stack.pop()
        stack.append(num)
    if k != 0:
        stack = stack[:-k]
    return ''.join(stack)

내 코드의 문제점은 number와 k의 길이가 커지면 커질수록 partial이 점점 커지게 되고 최대값과 그 위치를 찾는 연산이 오래걸린다는 점이다.
탐욕법에 대해 제대로된 이해가 없어서 차마 앞에서 한 숫자씩 비교해가면서 최대값을 찾아가는 로직을 생각해내지 못했다.
전체적인 관점이 아니라 그때 그때마다 최선의 수를 선택하면서 전개하는 방식인 탐욕법에 대해서
좀 더 명확하게 알게되는 계기가 되었다.

'''
