/*
코딩테스트 입문
겹치는 선분의 길이
https://school.programmers.co.kr/learn/courses/30/lessons/120876
*/

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        for (int[] line : lines) {
            arr[line[0]+100]++;
            arr[line[1]+100]--;
        }

        int answer = arr[0] > 1 ? 1 : 0;
        for (int i = 1; i < 201; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > 1) {
                answer++;
            }
        }

        return answer;
    }
}