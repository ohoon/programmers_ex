/*
코딩 기초 트레이닝
세로 읽기
https://school.programmers.co.kr/learn/courses/30/lessons/181904
*/

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c-1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}