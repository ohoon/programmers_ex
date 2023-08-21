/*
연습문제
두 원 사이의 정수 쌍
https://programmers.co.kr/learn/courses/30/lessons/181187
*/

class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        for (int x = 1; x < r2; x++) {
            double y1 = Math.sqrt((long) r1*r1 >= (long) x*x ? (long) r1*r1 - (long) x*x : 0d);
            double y2 = Math.sqrt((long) r2*r2 - (long) x*x);
            answer += (int) y2 - (int) y1 + (y1 % 1 == 0 ? 1 : 0);
        }

        return (answer + 1) * 4;
    }
}