/*
코딩 기초 트레이닝
길이에 따른 연산
https://school.programmers.co.kr/learn/courses/30/lessons/181879
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int n = num_list.length;
        if (n > 10) {
            return Arrays.stream(num_list).sum();
        }

        int answer = 1;
        for (int num : num_list) {
            answer *= num;
        }

        return answer;
    }
}