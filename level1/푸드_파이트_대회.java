/*
코딩테스트 연습
푸드 파이터 대회
https://programmers.co.kr/learn/courses/30/lessons/134240
*/

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }

        String reverse = sb.reverse().toString();
        sb.reverse();
        sb.append('0');
        sb.append(reverse);
        return sb.toString();
    }
}