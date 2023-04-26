/*
코딩테스트 입문
한 번만 등장한 문자
https://school.programmers.co.kr/learn/courses/30/lessons/120896
*/

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chrs = s.toCharArray();
        Arrays.sort(chrs);
        String str = " " + new String(chrs) + " ";
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i-1) || str.charAt(i) == str.charAt(i+1)) {
                continue;
            }

            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}