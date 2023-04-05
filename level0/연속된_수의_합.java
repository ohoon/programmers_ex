/*
코딩테스트 입문
연속된 수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/120923
*/

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = num % 2 == 0 ? total/num - num/2 + 1 : total/num - num/2;
        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }

        return answer;
    }
}