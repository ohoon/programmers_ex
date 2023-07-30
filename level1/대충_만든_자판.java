/*
코딩테스트 연습
대충 만든 자판
https://programmers.co.kr/learn/courses/30/lessons/160586
*/

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] mapping = new int[26];
        for (String km : keymap) {
            for (int i = 0; i < km.length(); i++) {
                int index = km.charAt(i) - 'A';
                mapping[index] = mapping[index] == 0 ? i+1 : Math.min(mapping[index], i+1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (char ch : targets[i].toCharArray()) {
                int index = ch - 'A';
                if (mapping[index] == 0) {
                    answer[i] = -1;
                    break;
                }

                answer[i] += mapping[index];
            }
        }

        return answer;
    }
}