/*
코딩 기초 트레이닝
조건에 맞게 수열 변환하기 3
https://school.programmers.co.kr/learn/courses/30/lessons/181835
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(i -> k % 2 == 0 ? i+k : i*k).toArray();
    }
}