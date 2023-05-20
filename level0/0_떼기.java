/*
코딩 기초 트레이닝
0 떼기
https://school.programmers.co.kr/learn/courses/30/lessons/181847
*/

class Solution {
    public String solution(String n_str) {
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) == '0') {
                continue;
            }

            return n_str.substring(i);
        }

        return "";
    }
}