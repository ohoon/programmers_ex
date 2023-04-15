/*
코딩테스트 입문
배열 원소의 길이
https://school.programmers.co.kr/learn/courses/30/lessons/120854
*/

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}