/*
코딩테스트 입문
대문자와 소문자
https://school.programmers.co.kr/learn/courses/30/lessons/120893
*/

class Solution {

    private boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if (isUpperCase(ch)) {
                sb.append((char) ('a'+ch-'A'));
                continue;
            }

            sb.append((char) ('A'+ch-'a'));
        }

        return sb.toString();
    }
}