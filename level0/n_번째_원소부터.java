/*
코딩 기초 트레이닝
n 번째 원소부터
https://school.programmers.co.kr/learn/courses/30/lessons/181892
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}