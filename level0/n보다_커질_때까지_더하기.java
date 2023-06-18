/*
코딩 기초 트레이닝
n보다 커질 때까지 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/181884
*/

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers) {
            answer += num;
            if (answer > n) {
                break;
            }
        }

        return answer;
    }
}