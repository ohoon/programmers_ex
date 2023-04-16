/*
코딩테스트 입문
안전지대
https://school.programmers.co.kr/learn/courses/30/lessons/120866
*/

class Solution {
    private void mark(int[][] board, int r, int c) {
        int n = board.length;
        if (r < 0 || c < 0 || r >= n || c >= n || board[r][c] == 1) {
            return;
        }

        board[r][c] = -1;
    }

    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 1) {
                    continue;
                }

                mark(board, i-1, j-1);
                mark(board, i-1, j);
                mark(board, i-1, j+1);
                mark(board, i, j-1);
                mark(board, i, j+1);
                mark(board, i+1, j-1);
                mark(board, i+1, j);
                mark(board, i+1, j+1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 0) {
                    continue;
                }

                answer++;
            }
        }

        return answer;
    }
}