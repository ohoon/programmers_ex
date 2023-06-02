/*
코딩 기초 트레이닝
등차수열의 특정한 항만 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/181931
*/

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (!included[i]) {
                continue;
            }

            answer += a + i*d;
        }

        return answer;
    }
}