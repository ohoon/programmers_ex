/*
코딩 기초 트레이닝
문자열 곱하기
https://school.programmers.co.kr/learn/courses/30/lessons/181940
*/

class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}