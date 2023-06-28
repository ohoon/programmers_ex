/*
코딩 기초 트레이닝
카운트 다운
https://school.programmers.co.kr/learn/courses/30/lessons/181899
*/

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start-i;
        }

        return answer;
    }
}