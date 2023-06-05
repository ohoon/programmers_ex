/*
코딩 기초 트레이닝
원소들의 곱과 합
https://school.programmers.co.kr/learn/courses/30/lessons/181929
*/

class Solution {
    public int solution(int[] num_list) {
        int mult = 1, sum = 0;
        for (int num : num_list) {
            mult *= num;
            sum += num;
        }

        return mult < sum*sum ? 1 : 0;
    }
}