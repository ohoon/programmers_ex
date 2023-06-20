/*
코딩 기초 트레이닝
홀수 vs 짝수
https://school.programmers.co.kr/learn/courses/30/lessons/181887
*/

class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;
        for (int i = 0; i < num_list.length; i += 2) {
            odd += num_list[i];
        }

        for (int i = 1; i < num_list.length; i += 2) {
            even += num_list[i];
        }

        return Math.max(odd, even);
    }
}