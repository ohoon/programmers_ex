/*
코딩 기초 트레이닝
배열 만들기 1
https://school.programmers.co.kr/learn/courses/30/lessons/181901
*/

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k*(i+1);
        }

        return answer;
    }
}