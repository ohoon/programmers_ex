/*
코딩테스트 입문
종이 자르기
https://school.programmers.co.kr/learn/courses/30/lessons/120922
*/

class Solution {
    public int solution(int M, int N) {
        if (M == 1 && N == 1) {
            return 0;
        }

        return M > 1 ? 1 + solution(1, N) + solution(M-1, N) : 1 + solution(M, 1) + solution(M, N-1);
    }
}