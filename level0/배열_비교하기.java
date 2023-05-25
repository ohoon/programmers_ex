/*
코딩 기초 트레이닝
배열 비교하기
https://school.programmers.co.kr/learn/courses/30/lessons/181856
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        }

        if (arr1.length < arr2.length) {
            return -1;
        }

        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        if (sum1 > sum2) {
            return 1;
        }

        if (sum1 < sum2) {
            return -1;
        }

        return 0;
    }
}