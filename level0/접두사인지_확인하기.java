/*
코딩 기초 트레이닝
접두사인지 확인하기
https://school.programmers.co.kr/learn/courses/30/lessons/181906
*/

class Solution {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
