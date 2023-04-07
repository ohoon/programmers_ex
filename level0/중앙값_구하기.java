/*
코딩테스트 입문
중앙값 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120811
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}