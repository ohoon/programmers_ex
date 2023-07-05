/*
코딩 기초 트레이닝
접미사인지 확인하기
https://school.programmers.co.kr/learn/courses/30/lessons/181908
*/

class Solution {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}