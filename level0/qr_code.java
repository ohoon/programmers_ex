/*
코딩 기초 트레이닝
qr code
https://school.programmers.co.kr/learn/courses/30/lessons/181903
*/

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q != r) {
                continue;
            }

            sb.append(code.charAt(i));
        }

        return sb.toString();
    }
}