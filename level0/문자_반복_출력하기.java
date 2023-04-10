/*
코딩테스트 입문
문자 반복 출력하기
https://school.programmers.co.kr/learn/courses/30/lessons/120825
*/

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            sb.append(String.valueOf(ch).repeat(n));
        }

        return sb.toString();
    }
}