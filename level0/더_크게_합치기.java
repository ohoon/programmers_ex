/*
코딩 기초 트레이닝
더 크게 합치기
https://school.programmers.co.kr/learn/courses/30/lessons/181939
*/

class Solution {
    private int op(int a, int b) {
        return Integer.valueOf(String.valueOf(a) + String.valueOf(b));
    }

    public int solution(int a, int b) {
        return Math.max(op(a, b), op(b, a));
    }
}