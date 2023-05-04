/*
코딩테스트 입문
문자열안에 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/120908
*/

class Solution {
    public int solution(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i < n-m+1; i++) {
            if (str1.charAt(i) != str2.charAt(0)) {
                continue;
            }

            boolean isSucceed = true;
            for (int j = 0; j < m; j++) {
                if (str1.charAt(i+j) != str2.charAt(j)) {
                    isSucceed = false;
                    break;
                }
            }

            if (isSucceed) {
                return 1;
            }
        }

        return 2;
    }
}