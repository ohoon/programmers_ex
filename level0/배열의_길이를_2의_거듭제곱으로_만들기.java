/*
코딩 기초 트레이닝
배열의 길이를 2의 거듭제곱으로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181857
*/

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int n = (int) (Math.log(arr.length-1) / Math.log(2)) + 1;
        int[] answer = new int[(int) Math.pow(2, n)];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}