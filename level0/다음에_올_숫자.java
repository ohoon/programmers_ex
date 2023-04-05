/*
코딩테스트 입문
다음에 올 숫자
https://school.programmers.co.kr/learn/courses/30/lessons/120924
*/

class Solution {
    public int solution(int[] common) {
        int n = common.length;
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];
        int diff3 = common[n-1] - common[n-2];
        return diff1 == diff2 ? common[n-1] + diff1 : common[n-1] + diff3*diff2/diff1;
    }
}