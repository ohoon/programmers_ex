/*
코딩 기초 트레이닝
부분 문자열인지 확인하기
https://school.programmers.co.kr/learn/courses/30/lessons/181843
*/

class Solution {
    public int solution(String my_string, String target) {
        return my_string.indexOf(target) > -1 ? 1 : 0;
    }
}