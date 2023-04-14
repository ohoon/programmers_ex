/*
코딩테스트 입문
최댓값 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/120847
*/

class Solution {
    public int solution(int[] numbers) {
        int first = 0, second = 0;
        for (int num : numbers) {
            if (num < second) {
                continue;
            }

            if (num < first) {
                second = num;
                continue;
            }

            second = first;
            first = num;
        }

        return first * second;
    }
}