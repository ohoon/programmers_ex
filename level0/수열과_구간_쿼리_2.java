/*
코딩 기초 트레이닝
수열과 구간 쿼리 2
https://school.programmers.co.kr/learn/courses/30/lessons/181923
*/

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            int res = Integer.MAX_VALUE;
            for (int j = s; j <= e; j++) {
                if (arr[j] <= k) {
                    continue;
                }

                res = Math.min(res, arr[j]);
            }

            if (res == Integer.MAX_VALUE) {
                res = -1;
            }

            answer[i] = res;
        }

        return answer;
    }
}