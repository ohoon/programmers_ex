/*
코딩테스트 입문
제곱수 판별하기
https://school.programmers.co.kr/learn/courses/30/lessons/120909
*/

class Solution {
    public int solution(int n) {
        return Math.sqrt(n) == (double) ((int) Math.sqrt(n)) ? 1 : 2;
    }
}