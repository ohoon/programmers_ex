/*
코딩 기초 트레이닝
조건에 맞게 수열 변환하기 2
https://school.programmers.co.kr/learn/courses/30/lessons/181881
*/

class Solution {
    public int solution(int[] arr) {
        int x = 1;
        while (true) {
            boolean isChanged = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    isChanged = true;
                    continue;
                }

                if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    isChanged = true;
                }
            }

            if (!isChanged) {
                return x-1;
            }

            x++;
        }
    }
}