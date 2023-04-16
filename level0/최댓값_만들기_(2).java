/*
코딩테스트 입문
최댓값 만들기 (2)
https://school.programmers.co.kr/learn/courses/30/lessons/120862
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[n-2] * numbers[n-1]);
    }
}