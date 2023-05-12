/*
코딩 기초 트레이닝
특별한 이차원 배열 1
https://school.programmers.co.kr/learn/courses/30/lessons/181833
*/

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}