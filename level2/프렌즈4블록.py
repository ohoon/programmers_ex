'''
2018 KAKAO BLIND RECRUITMENT
[1차] 프렌즈4블록
https://programmers.co.kr/learn/courses/30/lessons/17679
'''

def solution(m, n, board):
    while True:
        success = []        # 2x2 성공한 블록
        for i in range(1, m):
            for j in range(1, n):
                if board[i][j] == "_":      # 비어있는 블록은 패스
                    continue
                    
                if board[i-1][j-1] == board[i-1][j] == board[i][j-1] == board[i][j]:        # 2x2 조건 성립한 블록
                    success.append((i, j))
                    
        if not success:     # 2x2에 해당하는 블록이 없으면 종료
            break
            
        for i, j in success:        # 2x2에 해당하는 블록은 _처리
            board[i-1] = board[i-1][:j-1] + "__" + board[i-1][j+1:]
            board[i] = board[i][:j-1] + "__" + board[i][j+1:]

        for i in range(m - 1, 0, -1):       # 밑 블록부터 탐색하여 _인 블록을 만나면 상단 블록에서 _이 아닌 블록을 가져와서 교환
            for j in range(n):
                if board[i][j] == "_":
                    for _i in range(i - 1, -1, -1):
                        if board[_i][j] != "_":
                            board[i] = board[i][:j] + board[_i][j] + board[i][j+1:]
                            board[_i] = board[_i][:j] + "_" + board[_i][j+1:]
                            break
                        
    return sum([x.count("_") for x in board])       # _블럭들의 개수를 구하여 반환

'''
여담

2x2 블록 찾아서 _처리하는 것은 쉬웠는데,
빈공간을 윗 블록들이 채우는 로직을 생각한다고 시간을 좀 썼다.
그래도 1시간 내에 풀이한 거 같아 다행이다.
for문 중첩이 많아 소모 시간이 클 것이라 예상했는데, 생각보다 그렇게 많은 시간이 걸리진 않더라.
'''