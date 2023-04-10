/*
코딩테스트 입문
배열 자르기
https://school.programmers.co.kr/learn/courses/30/lessons/120833
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}