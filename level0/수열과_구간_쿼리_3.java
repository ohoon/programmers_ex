/*
코딩 기초 트레이닝
수열과 구간 쿼리 3
https://school.programmers.co.kr/learn/courses/30/lessons/181924
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int temp = arr[q[0]];
            arr[q[0]] = arr[q[1]];
            arr[q[1]] = temp;
        }

        return arr;
    }
}