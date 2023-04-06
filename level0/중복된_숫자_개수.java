/*
코딩테스트 입문
중복된 숫자 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120583
*/

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int num : array) {
            if (num == n) {
                answer++;
            }
        }

        return answer;
    }
}