/*
코딩 기초 트레이닝
원하는 문자열 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/181878
*/

class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().indexOf(pat.toLowerCase()) > -1 ? 1 : 0;
    }
}