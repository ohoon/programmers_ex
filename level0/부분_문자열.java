/*
코딩 기초 트레이닝
부분 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/181842
*/

class Solution {
    public int solution(String str1, String str2) {
        return str2.indexOf(str1) > -1 ? 1 : 0;
    }
}