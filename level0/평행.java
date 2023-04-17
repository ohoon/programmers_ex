/*
코딩테스트 입문
평행
https://school.programmers.co.kr/learn/courses/30/lessons/120875
*/

class Solution {
    public int solution(int[][] dots) {
        int n = dots.length;
        double[][] slope = new double[n][n];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                slope[i][j] = (double) (dots[i][0] - dots[j][0]) / (dots[i][1] - dots[j][1]);
            }
        }

        return (slope[0][1] == slope[2][3] || slope[0][2] == slope[1][3] || slope[0][3] == slope[1][2]) ? 1 : 0;
    }
}