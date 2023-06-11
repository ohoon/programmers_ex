/*
코딩 기초 트레이닝
문자열이 몇 번 등장하는지 세기
https://school.programmers.co.kr/learn/courses/30/lessons/181871
*/

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = pat.length();
        for (int i = n; i <= myString.length(); i++) {
            if (pat.equals(myString.substring(i-n, i))) {
                answer++;
            }
        }

        return answer;
    }
}