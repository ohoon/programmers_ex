/*
코딩테스트 입문
짝수 홀수 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120824
*/

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}