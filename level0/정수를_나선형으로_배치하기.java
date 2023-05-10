/*
코딩 기초 트레이닝
정수를 나선형으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/181832
*/

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int r = 0, c = 0;
        int num = 1;
        for (int i = n-1; i > 0; i -= 2) {
            for (int j = 0; j < 4; j++) {
                int[] dir = dirs[j];
                for (int k = 0; k < i; k++) {
                    answer[r][c] = num++;
                    c += (j == 3 && k == i-1 ? 1 : dir[0]);
                    r += (j == 3 && k == i-1 ? 0 : dir[1]);
                }
            }
        }

        if (n % 2 == 1) {
            answer[n/2][n/2] = num;
        }

        return answer;
    }
}