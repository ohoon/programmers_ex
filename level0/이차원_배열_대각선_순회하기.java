/*
코딩 기초 트레이닝
이차원 배열 대각선 순회하기
https://school.programmers.co.kr/learn/courses/30/lessons/181829
*/

class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i <= Math.min(board.length-1, k); i++) {
            for (int j = 0; j <= Math.min(board[0].length-1, k); j++) {
                if ((i + j) > k) {
                    break;
                }

                answer += board[i][j];
            }
        }

        return answer;
    }
}