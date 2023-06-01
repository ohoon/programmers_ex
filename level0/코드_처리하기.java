/*
코딩 기초 트레이닝
코드 처리하기
https://school.programmers.co.kr/learn/courses/30/lessons/181932
*/

class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }

            if ((!mode && i % 2 == 0) ||
                    (mode && i % 2 == 1)) {
                sb.append(code.charAt(i));
                continue;
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}