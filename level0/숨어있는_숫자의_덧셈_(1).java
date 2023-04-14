/*
코딩테스트 입문
숨어있는 숫자의 덧셈 (1)
https://school.programmers.co.kr/learn/courses/30/lessons/120851
*/

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char ch : my_string.toCharArray()) {
            if (ch < '0' || ch > '9') {
                continue;
            }

            answer += ch-'0';
        }

        return answer;
    }
}