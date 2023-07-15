/*
코딩 기초 트레이닝
두 수의 연산값 비교하기
https://school.programmers.co.kr/learn/courses/30/lessons/181938
*/

class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.valueOf(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}
