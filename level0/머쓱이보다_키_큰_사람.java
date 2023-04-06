/*
코딩테스트 입문
머쓱이보다 키 큰 사람
https://school.programmers.co.kr/learn/courses/30/lessons/120585
*/

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int h : array) {
            if (h > height) {
                answer++;
            }
        }

        return answer;
    }
}