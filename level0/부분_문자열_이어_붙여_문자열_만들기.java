/*
코딩 기초 트레이닝
부분 문자열 이어 붙여 문자열 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181911
*/

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }

        return sb.toString();
    }
}