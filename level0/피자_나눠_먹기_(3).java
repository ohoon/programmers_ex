/*
코딩테스트 입문
피자 나눠 먹기 (3)
https://school.programmers.co.kr/learn/courses/30/lessons/120816
*/

class Solution {
    public int solution(int slice, int n) {
        return (int) Math.ceil((float) n / slice);
    }
}