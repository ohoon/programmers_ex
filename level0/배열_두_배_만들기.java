/*
코딩테스트 입문
배열 두 배 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/120809
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map((num->num*2)).toArray();
    }
}