/*
코딩테스트 입문
분수의 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/120808
*/

class Solution {
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a%b);     // 유클리드 호제법
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(Math.max(numer, denom), Math.min(numer, denom));
        return new int[]{numer/gcd, denom/gcd};
    }
}