/*
코딩테스트 입문
점의 위치 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120841
*/

class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0) {
            return dot[1] > 0 ? 1 : 4;
        }

        return dot[1] > 0 ? 2 : 3;
    }
}