/*
코딩테스트 연습
기사단원의 무기
https://programmers.co.kr/learn/courses/30/lessons/136798
*/

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if (i % j != 0) {
                    continue;
                }

                count += (j*j == i ? 1 : 2);
                if (count > limit) {
                    break;
                }
            }

            answer += (count > limit ? power : count);
        }

        return answer;
    }
}