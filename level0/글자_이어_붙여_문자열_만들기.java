/*
코딩 기초 트레이닝
글자 이어 붙여 문자열 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181915
*/

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int index : index_list) {
            sb.append(my_string.charAt(index));
        }

        return sb.toString();
    }
}