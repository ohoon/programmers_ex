/*
코딩 기초 트레이닝
가까운 1 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/181898
*/

class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i< arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}