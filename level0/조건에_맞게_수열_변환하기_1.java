/*
코딩 기초 트레이닝
조건에 맞게 수열 변환하기 1
https://school.programmers.co.kr/learn/courses/30/lessons/181882
*/

class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
                continue;
            }

            if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
            }
        }

        return arr;
    }
}