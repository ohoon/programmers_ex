/*
코딩 기초 트레이닝
1로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181880
*/

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            answer += (int) (Math.log(num) / Math.log(2));
        }

        return answer;
    }
}