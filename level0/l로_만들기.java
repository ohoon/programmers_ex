/*
코딩 기초 트레이닝
l로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181834
*/

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            sb.append(ch < 'l' ? 'l' : ch);
        }

        return sb.toString();
    }
}