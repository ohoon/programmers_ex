/*
코딩테스트 입문
이진수 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/120885
*/

class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int n = bin1.length();
        int m = bin2.length();
        if (n > m) {
            bin2 = "0".repeat(n-m) + bin2;
            m = n;
        } else if (n < m) {
            bin1 = "0".repeat(m-n) + bin1;
            n = m;
        }

        int carry = 0;
        for (int i = n-1; i >= 0; i--) {
            int bit1 = bin1.charAt(i)-'0';
            int bit2 = bin2.charAt(i)-'0';
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            sb.append((char) ('0' + sum % 2));
        }

        if (carry == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}