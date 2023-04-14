/*
코딩테스트 입문
팩토리얼
https://school.programmers.co.kr/learn/courses/30/lessons/120848
*/

class Solution {
    public int solution(int n) {
        long result = 1;
        for (int i = 2; i <= 11; i++) {
            result *= i;
            if (result > n) {
                return i-1;
            }
        }

        return -1;
    }
}