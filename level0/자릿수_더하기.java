/*
코딩테스트 입문
자릿수 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/120906
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}