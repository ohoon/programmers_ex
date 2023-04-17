/*
코딩테스트 입문
외계어 사전
https://school.programmers.co.kr/learn/courses/30/lessons/120869
*/

class Solution {
    public int solution(String[] spell, String[] dic) {
        int[][] freq = new int[dic.length][26];
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];
            for (char ch : word.toCharArray()) {
                freq[i][ch-'a']++;
            }
        }

        for (int i = 0; i < dic.length; i++) {
            boolean isSuccess = true;
            for (String alp : spell) {
                if (freq[i][alp.charAt(0)-'a'] != 1) {
                    isSuccess = false;
                    break;
                }
            }

            if (isSuccess) {
                return 1;
            }
        }

        return 2;
    }
}