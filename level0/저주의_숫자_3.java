/*
코딩테스트 입문
저주의 숫자 3
https://school.programmers.co.kr/learn/courses/30/lessons/120871
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).indexOf("3") > -1) {
                answer++;
            }
        }

        return answer;
    }
}