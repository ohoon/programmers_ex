/*
코딩테스트 입문
배열의 유사도
https://school.programmers.co.kr/learn/courses/30/lessons/120903
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>();
        for (String str : s1) {
            set.add(str);
        }

        int answer = 0;
        for (String str : s2) {
            if (!set.contains(str)) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}