'''
2019 카카오 개발자 겨울 인턴십
크레인 인형뽑기 게임
https://programmers.co.kr/learn/courses/30/lessons/64061
'''

def solution(board, moves):
    answer = 0
    basket = []

    for move in moves:
        col = move - 1

        for row in board:   # 위에서부터 탐색
            item = row[col]

            if (item > 0):  # 맨 위의 인형 item

                # 스택에 넣을 인형과 동일한 인형이 스택 맨 위에 존재하면
                if (len(basket) > 0 and basket[-1] == item):
                    basket.pop()
                    row[col] = 0
                    answer += 2
                    break

                # 스택이 비어있거나 인형이 겹치지 않으면
                basket.append(item)
                row[col] = 0
                break
        
    return answer