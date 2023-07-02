/*
코딩 기초 트레이닝
문자열 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/181905
*/

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        return my_string.substring(0, s) +
                sb.reverse().toString() +
                my_string.substring(e+1, my_string.length());
    }
}