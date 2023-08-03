/*
코딩테스트 연습
가장 가까운 같은 글자
https://programmers.co.kr/learn/courses/30/lessons/142086
*/

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] prev = new int[26];
        for (int i = 0; i < 26; i++) {
            prev[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            answer[i] = prev[index] > -1 ? i - prev[index] : -1;
            prev[index] = i;
        }

        return answer;
    }
}