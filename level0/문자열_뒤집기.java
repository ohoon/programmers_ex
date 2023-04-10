/*
코딩테스트 입문
문자열 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/120822
*/

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int n = my_string.length();
        for (int i = 0; i < n; i++) {
            sb.append(my_string.charAt(n-i-1));
        }

        return sb.toString();
    }
}