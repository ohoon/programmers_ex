/*
코딩 기초 트레이닝
문자열 바꿔서 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/181864
*/

class Solution {
    public int solution(String myString, String pat) {
        int n = myString.length();
        int m = pat.length();
        for (int i = 0; i < n-m+1; i++) {
            boolean isSucceed = true;
            for (int j = 0; j < m; j++) {
                if (myString.charAt(i+j) == pat.charAt(j)) {
                    isSucceed = false;
                    break;
                }
            }

            if (isSucceed) {
                return 1;
            }
        }

        return 0;
    }
}