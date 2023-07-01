/*
코딩 기초 트레이닝
문자 개수 세기
https://school.programmers.co.kr/learn/courses/30/lessons/181902
*/

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'a') {
                answer[26+ch-'a']++;
                continue;
            }

            answer[ch-'A']++;
        }

        return answer;
    }
}