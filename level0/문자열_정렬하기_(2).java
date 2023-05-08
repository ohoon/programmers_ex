/*
코딩테스트 입문
문자열 정렬하기 (2)
https://school.programmers.co.kr/learn/courses/30/lessons/120911
*/

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] chrs = my_string.toLowerCase().toCharArray();
        Arrays.sort(chrs);
        return new String(chrs);
    }
}