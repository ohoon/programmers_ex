/*
코딩 기초 트레이닝
flag에 따라 다른 값 반환하기
https://school.programmers.co.kr/learn/courses/30/lessons/181933
*/

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}