/*
코딩테스트 입문
다항식 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/120863
*/

class Solution {
    public String solution(String polynomial) {
        int a = 0, b = 0;
        for (String str : polynomial.split(" \\+ ")) {
            if (str.endsWith("x")) {
                a += str.equals("x") ? 1 : Integer.valueOf(str.substring(0, str.length()-1));
            } else {
                b += Integer.valueOf(str);
            }
        }

        if (a == 0 && b > 0) {
            return String.valueOf(b);
        }

        if (a > 0 && b == 0) {
            return (a > 1 ? a : "") + "x";
        }

        return (a > 1 ? a : "") + "x + " + b;
    }
}