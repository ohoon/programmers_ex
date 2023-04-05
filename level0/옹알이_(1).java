/*
코딩테스트 입문
옹알이 (1)
https://school.programmers.co.kr/learn/courses/30/lessons/120956
*/

import java.util.HashSet;
import java.util.Set;

class Solution {

    private void backtrack(Set<String> set, String[] words, String str, boolean[] used) {
        set.add(str);
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            backtrack(set, words, str+words[i], used);
            used[i] = false;
        }
    }

    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        backtrack(set, new String[]{"aya", "ye", "woo", "ma"}, "", new boolean[4]);
        for (String s : babbling) {
            if (set.contains(s)) {
                answer++;
            }
        }

        return answer;
    }
}