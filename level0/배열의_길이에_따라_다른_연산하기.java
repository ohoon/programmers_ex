/*
코딩 기초 트레이닝
배열의 길이에 따라 다른 연산하기
https://school.programmers.co.kr/learn/courses/30/lessons/181854
*/

class Solution {
    public int[] solution(int[] arr, int n) {
        for (int i = (arr.length % 2 == 0 ? 1 : 0); i < arr.length; i += 2) {
            arr[i] += n;
        }

        return arr;
    }
}