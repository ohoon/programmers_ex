/*
코딩테스트 입문
문자열 밀기
https://school.programmers.co.kr/learn/courses/30/lessons/120921
*/

class Solution {
    public int solution(String A, String B) {
        A += A;
        int index = A.lastIndexOf(B);
        if (index == -1) {
            return -1;
        }

        return B.length() - index;
    }
}