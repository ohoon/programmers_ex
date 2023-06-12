/*
코딩 기초 트레이닝
특정한 문자를 대문자로 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/181873
*/

class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp.charAt(0), (char) (alp.charAt(0)-32));
    }
}