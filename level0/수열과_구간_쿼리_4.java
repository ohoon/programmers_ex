/*
코딩 기초 트레이닝
수열과 구간 쿼리 4
https://school.programmers.co.kr/learn/courses/30/lessons/181922
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int m = q[1]+1;
            for (int i = q[0]; i <= q[1]; i++) {
                if (i % q[2] == 0) {
                    m = i;
                    break;
                }
            }

            for (int i = m; i <= q[1]; i += q[2]) {
                arr[i]++;
            }
        }

        return arr;
    }
}