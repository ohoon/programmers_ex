/*
코딩 기초 트레이닝
정사각형으로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181830
*/

class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int N = Math.max(n, m);
        int[][] answer = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer[i][j] = (i < n && j < m) ? arr[i][j] : 0;
            }
        }

        return answer;
    }
}