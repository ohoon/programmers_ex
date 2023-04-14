/*
코딩테스트 입문
모음 제거
https://school.programmers.co.kr/learn/courses/30/lessons/120849
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> vowelSet = new HashSet<>(){{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }};

        for (char ch : my_string.toCharArray()) {
            if (vowelSet.contains(ch)) {
                continue;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}