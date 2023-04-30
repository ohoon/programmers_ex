/*
코딩테스트 입문
가장 큰 수 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/120899
*/

class Solution {
    public int[] solution(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return new int[]{array[maxIndex], maxIndex};
    }
}