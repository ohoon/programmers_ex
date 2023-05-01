/*
코딩테스트 입문
숫자 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/120904
*/

class Solution {
    public int solution(int num, int k) {
        int findIndex = String.valueOf(num).indexOf(String.valueOf(k));
        return findIndex > -1 ? findIndex + 1 : findIndex;
    }
}