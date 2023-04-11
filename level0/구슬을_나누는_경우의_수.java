/*
코딩테스트 입문
구슬을 나누는 경우의 수
https://school.programmers.co.kr/learn/courses/30/lessons/120840
*/

import java.math.BigInteger;

class Solution {
    private BigInteger factorial(int num, int limit) {
        if (num == limit) {
            return BigInteger.valueOf(num);
        }

        return BigInteger.valueOf(num).multiply(factorial(num-1, limit));
    }

    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }

        return (factorial(balls, Math.max(balls-share, share)+1).divide(factorial(Math.min(balls-share, share), 1))).intValue();
    }
}