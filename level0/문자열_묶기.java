/*
코딩 기초 트레이닝
문자열 묶기
https://school.programmers.co.kr/learn/courses/30/lessons/181855
*/

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] freq = new int[31];
        for (String str : strArr) {
            answer = Math.max(answer, ++freq[str.length()]);
        }

        return answer;
    }
}