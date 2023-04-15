/*
코딩테스트 입문
직사각형 넓이 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120860
*/

class Solution {
    public int solution(int[][] dots) {
        int height = 0, width = 0;
        for (int i = 0; i < dots.length-1; i++) {
            for (int j = i+1; j < dots.length; j++) {
                if (dots[i][0] == dots[j][0]) {
                    height = Math.abs(dots[i][1] - dots[j][1]);
                    continue;
                }

                if (dots[i][1] == dots[j][1]) {
                    width = Math.abs(dots[i][0] - dots[j][0]);
                    continue;
                }
            }
        }

        return height * width;
    }
}