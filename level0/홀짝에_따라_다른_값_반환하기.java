/*
코딩 기초 트레이닝
홀짝에 따라 다른 값 반환하기
https://school.programmers.co.kr/learn/courses/30/lessons/181935
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = n % 2 == 0 ? 0 : 1; i <= n; i += 2) {
            answer += n % 2 == 0 ? i*i : i;
        }
        
        return answer;
    }
}
