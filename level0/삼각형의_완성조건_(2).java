/*
코딩테스트 입문
삼각형의 완성조건 (2)
https://school.programmers.co.kr/learn/courses/30/lessons/120868
*/

class Solution {
    public int solution(int[] sides) {
        return sides[0] + sides[1] - Math.abs(sides[0] - sides[1]) - 1;
    }
}