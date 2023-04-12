/*
코딩테스트 입문
배열 회전시키기
https://school.programmers.co.kr/learn/courses/30/lessons/120844
*/

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        int startIndex = direction.equals("left") ? 1 : n-1;
        for (int i = 0; i < n; i++) {
            answer[i] = numbers[startIndex++ % n];
        }

        return answer;
    }
}