/*
코딩테스트 입문
외계행성의 나이
https://school.programmers.co.kr/learn/courses/30/lessons/120834
*/

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            sb.append((char)('a' + age%10));
            age /= 10;
        }

        return sb.reverse().toString();
    }
}