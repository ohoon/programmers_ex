/*
코딩테스트 입문
배열 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/120821
*/

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[n-i-1];
        }

        return answer;
    }
}