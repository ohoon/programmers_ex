/*
코딩테스트 입문
2차원으로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/120842
*/

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int cur = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[cur++];
            }
        }

        return answer;
    }
}