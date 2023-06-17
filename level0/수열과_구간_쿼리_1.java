/*
코딩 기초 트레이닝
수열과 구간 쿼리 1
https://school.programmers.co.kr/learn/courses/30/lessons/181883
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] inc = new int[arr.length+1];
        for (int[] query : queries) {
            inc[query[0]]++;
            inc[query[1]+1]--;
        }

        for (int i = 1; i < inc.length; i++) {
            inc[i] += inc[i-1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] += inc[i];
        }

        return arr;
    }
}