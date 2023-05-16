/*
코딩 기초 트레이닝
주사위 게임 1
https://school.programmers.co.kr/learn/courses/30/lessons/181839
*/

class Solution {
    public int solution(int a, int b) {
        boolean oddA = a % 2 == 1;
        boolean oddB = b % 2 == 1;
        if (oddA && oddB) {
            return a*a + b*b;
        }

        if (!oddA && !oddB) {
            return Math.abs(a-b);
        }

        return 2 * (a + b);
    }
}