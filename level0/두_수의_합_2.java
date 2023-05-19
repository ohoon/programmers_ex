/*
코딩 기초 트레이닝
두 수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/181846
*/

class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = a.length();
        int m = b.length();
        int carry = 0;
        for (int i = n-1, j = m-1; i >= 0 || j >= 0; i--, j--) {
            int sum = (i >= 0 ? a.charAt(i) - '0' : 0) + (j >= 0 ? b.charAt(j) - '0' : 0) + carry;
            carry = sum / 10;
            sb.append(String.valueOf(sum % 10));
        }

        if (carry > 0) {
            sb.append(String.valueOf(carry % 10));
        }

        return sb.reverse().toString();
    }
}