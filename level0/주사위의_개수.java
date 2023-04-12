/*
코딩테스트 입문
주사위의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120845
*/

class Solution {
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}