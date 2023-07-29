/*
코딩테스트 연습
덧질하기
https://programmers.co.kr/learn/courses/30/lessons/161989
*/

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, cur = 0;
        for (int s : section) {
            if (cur > s) {
                continue;
            }

            cur = s + m;
            answer++;
        }

        return answer;
    }
}