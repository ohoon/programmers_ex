/*
코딩테스트 입문
각도기
https://school.programmers.co.kr/learn/courses/30/lessons/120829
*/

class Solution {
    public int solution(int angle) {
        if (angle < 90) {
            return 1;
        }

        if (angle == 90) {
            return 2;
        }

        if (angle < 180) {
            return 3;
        }

        return 4;
    }
}