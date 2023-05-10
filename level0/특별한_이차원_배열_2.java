/*
코딩 기초 트레이닝
특별한 이차원 배열 2
https://school.programmers.co.kr/learn/courses/30/lessons/181831
*/

class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        return 1;
    }
}