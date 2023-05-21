/*
코딩 기초 트레이닝
문자열 정수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/181849
*/

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (char ch : num_str.toCharArray()) {
            answer += ch - '0';
        }

        return answer;
    }
}