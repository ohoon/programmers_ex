/*
코딩 기초 트레이닝
배열 만들기 3
https://school.programmers.co.kr/learn/courses/30/lessons/181895
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] arrA = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] arrB = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        int[] answer = new int[arrA.length+arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            answer[i] = arrA[i];
        }

        for (int i = 0; i < arrB.length; i++) {
            answer[arrA.length+i] = arrB[i];
        }

        return answer;
    }
}