/*
코딩테스트 입문
중복된 문자 제거
https://school.programmers.co.kr/learn/courses/30/lessons/120888
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char ch : my_string.toCharArray()) {
            if (set.contains(ch)) {
                continue;
            }

            set.add(ch);
            sb.append(ch);
        }

        return sb.toString();
    }
}