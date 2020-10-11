'''
스택/큐
주식가격
https://programmers.co.kr/learn/courses/30/lessons/42584
'''

def solution(prices):
    answer = []
    stack = []
    
    while(prices):
        popped = prices.pop()
        timer = 0
        for i in range(len(stack)):
            timer += 1
            if (popped > stack[-(i+1)]):
                break
                
        answer.append(timer)
        stack.append(popped)

    return answer[::-1]

'''
여담

사실 이 문제는 스택을 이용한 문제다.
어찌저찌 통과는 했지만 내 코드는 이중 for문과 다름 없기 때문에
시간복잡도가 최악엔 O(N*N)이다..
스택으로 풀어야 하는데 알듯 말듯 모르겠다.
다음에 시간을 내서 스택으로 다시 풀어봐야겠다.
 
'''
