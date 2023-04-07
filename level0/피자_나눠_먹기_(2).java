/*
코딩테스트 입문
피자 나눠 먹기 (2)
https://school.programmers.co.kr/learn/courses/30/lessons/120815
*/

class Solution {
    private int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }

    public int solution(int n) {
        return n / gcd(n, 6);
    }
}