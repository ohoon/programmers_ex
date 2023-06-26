/*
코딩 기초 트레이닝
2의 영역
https://school.programmers.co.kr/learn/courses/30/lessons/181894
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int L = 0, R = arr.length-1;
        while (L < arr.length && arr[L] != 2) {
            L++;
        }

        while (R >= L && arr[R] != 2) {
            R--;
        }

        if (L > R) {
            return new int[]{-1};
        }

        return Arrays.copyOfRange(arr, L, R+1);
    }
}