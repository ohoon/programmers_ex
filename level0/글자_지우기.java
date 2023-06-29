/*
코딩 기초 트레이닝
글자 지우기
https://school.programmers.co.kr/learn/courses/30/lessons/181900
*/

class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        for (int index : indices) {
            arr[index] = '.';
        }

        return new String(arr).replace(".", "");
    }
}