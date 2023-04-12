/*
코딩테스트 입문
공 던지기
https://school.programmers.co.kr/learn/courses/30/lessons/120843
*/

class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int index = (2*k - 1) % n - 1;
        return numbers[index > -1 ? index : n-1];
    }
}