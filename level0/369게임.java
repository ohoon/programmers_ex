/*
코딩테스트 입문
369게임
https://school.programmers.co.kr/learn/courses/30/lessons/120891
*/

class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        return str.length() - str.replace("3", "").replace("6", "").replace("9", "").length();
    }
}