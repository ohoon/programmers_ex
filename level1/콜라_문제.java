/*
코딩테스트 연습
콜라 문제
https://programmers.co.kr/learn/courses/30/lessons/132267
*/

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newBottle = (n / a) * b;
            answer += newBottle;
            n = n % a + newBottle;
        }

        return answer;
    }
}