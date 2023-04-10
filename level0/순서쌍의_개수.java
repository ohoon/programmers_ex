/*
코딩테스트 입문
순서쌍의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120836
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int root = (int) Math.pow(n, 0.5);
        for (int i = 1; i <= root; i++) {
            if (n % i == 0) {
                answer += 2;
            }
        }

        return root * root == n ? answer - 1 : answer;
    }
}