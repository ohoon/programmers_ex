/*
코딩테스트 입문
삼각형의 완성조건 (1)
https://school.programmers.co.kr/learn/courses/30/lessons/120889
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}