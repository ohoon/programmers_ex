/*
코딩 기초 트레이닝
순서 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/181891
*/

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[(i+n)%num_list.length];
        }

        return answer;
    }
}