'''
2021 Dev-Matching: 웹 백엔드 개발자(상반기)
행렬 테두리 회전하기
https://programmers.co.kr/learn/courses/30/lessons/77485
'''

def solution(rows, columns, queries):
    answer = []
    stage = [[columns * (i - 1) + j for j in range(1, columns + 1)] for i in range(1, rows + 1)]        # 초기 행렬 생성
    for q in queries:
        x1, y1, x2, y2 = q[0] - 1, q[1] - 1, q[2] - 1, q[3] - 1
        temp = stage[x1][y1]            # (x1, y1)의 값은 미리 백업
        answer.append(temp)
        for i in range(x1, x2):         # 왼쪽 모서리 부분
            stage[i][y1] = stage[i+1][y1]
            if stage[i][y1] < answer[-1]:   # 최솟값 갱신
                answer.pop()
                answer.append(stage[i][y1])
                
        for i in range(y1, y2):         # 아래쪽 모서리 부분
            stage[x2][i] = stage[x2][i+1]
            if stage[x2][i] < answer[-1]:   # 최솟값 갱신
                answer.pop()
                answer.append(stage[x2][i])
                
        for i in range(x2, x1, -1):     # 오른쪽 모서리 부분
            stage[i][y2] = stage[i-1][y2]
            if stage[i][y2] < answer[-1]:   # 최솟값 갱신
                answer.pop()
                answer.append(stage[i][y2])
                
        for i in range(y2, y1, -1):     # 위쪽 모서리 부분
            stage[x1][i] = stage[x1][i-1]
            if stage[x1][i] < answer[-1]:   # 최솟값 갱신
                answer.pop()
                answer.append(stage[x1][i])
        
        stage[x1][y1+1] = temp          # 백업해둔 값을 (x1, y1+1)에 저장
        
    return answer
