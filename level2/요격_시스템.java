/*
연습문제
요격 시스템
https://programmers.co.kr/learn/courses/30/lessons/181188
*/

import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0, prev = -1;
        Arrays.sort(targets, (x, y) -> x[1] - y[1]);
        for (int[] target : targets) {
            if (target[0] < prev) {
                continue;
            }

            answer++;
            prev = target[1];
        }

        return answer;
    }
}