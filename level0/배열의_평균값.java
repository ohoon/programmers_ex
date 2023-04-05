/*
코딩테스트 입문
배열의 평균값
https://school.programmers.co.kr/learn/courses/30/lessons/120817
*/

import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).sum() / (float) numbers.length;
    }
}