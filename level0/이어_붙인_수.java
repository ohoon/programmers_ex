/*
코딩 기초 트레이닝
이어 붙인 수
https://school.programmers.co.kr/learn/courses/30/lessons/181928
*/

class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;
        for (int num : num_list) {
            if (num % 2 == 0) {
                even = even * 10 + num;
                continue;
            }

            odd = odd * 10 + num;
        }

        return odd + even;
    }
}