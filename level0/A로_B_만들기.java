/*
코딩테스트 입문
A로 B 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/120886
*/

import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        return new String(beforeArr).equals(new String(afterArr)) ? 1 : 0;
    }
}