/*
코딩 기초 트레이닝
주사위 게임 2
https://school.programmers.co.kr/learn/courses/30/lessons/181930
*/

class Solution {
    public int solution(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }

        if (a == b || b == c || c == a) {
            return (a + b + c) * (a*a + b*b + c*c);
        }

        return a + b + c;
    }
}