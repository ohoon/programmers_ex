/*
코딩테스트 연습
문자열 나누기
https://programmers.co.kr/learn/courses/30/lessons/140108
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        int cur = 0;
        while (cur < n) {
            char ch = s.charAt(cur++);
            int eq = 1, neq = 0;
            while (cur < n && eq != neq) {
                if (s.charAt(cur++) == ch) {
                    eq++;
                } else {
                    neq++;
                }
            }

            answer++;
        }

        return answer;
    }
}