/*
코딩테스트 연습
크기가 작은 부분 문자열
https://programmers.co.kr/learn/courses/30/lessons/147355
*/

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n = t.length();
        int m = p.length();
        for (int i = 0; i <= n-m; i++) {
            for (int j = 0; j < m; j++) {
                if (t.charAt(i+j) > p.charAt(j)) {
                    break;
                }

                if (t.charAt(i+j) < p.charAt(j)) {
                    answer++;
                    break;
                }

                if (j == m-1) {
                    answer++;
                }
            }
        }

        return answer;
    }
}