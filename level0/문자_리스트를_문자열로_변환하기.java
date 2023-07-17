/*
코딩 기초 트레이닝
문자 리스트를 문자열로 변환하기
https://school.programmers.co.kr/learn/courses/30/lessons/181941
*/

class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }
}