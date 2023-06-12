/*
코딩 기초 트레이닝
특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/181872
*/

class Solution {
    public String solution(String myString, String pat) {
        int n = pat.length();
        for (int i = myString.length() - n; i >= 0; i--) {
            if (pat.equals(myString.substring(i, i+n))) {
                return myString.substring(0, i+n);
            }
        }

        return "";
    }
}