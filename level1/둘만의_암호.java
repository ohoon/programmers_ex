/*
코딩테스트 연습
둘만의 암호
https://programmers.co.kr/learn/courses/30/lessons/155652
*/

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        boolean[] isSkipped = new boolean[26];
        for (char ch : skip.toCharArray()) {
            isSkipped[ch-'a'] = true;
        }

        for (char ch : s.toCharArray()) {
            int i = ch - 'a';
            int move = index;
            while (move > 0) {
                if (!isSkipped[++i%26]) {
                    move--;
                }
            }

            sb.append((char) ('a' + i % 26));
        }

        return sb.toString();
    }
}