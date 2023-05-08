/*
코딩테스트 입문
7의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120912
*/

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int n : array) {
            while (n > 0) {
                if (n % 10 == 7) {
                    answer++;
                }

                n /= 10;
            }
        }

        return answer;
    }
}