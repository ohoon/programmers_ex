/*
코딩테스트 입문
개미 군단
https://school.programmers.co.kr/learn/courses/30/lessons/120837
*/

class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp;
        return answer;
    }
}