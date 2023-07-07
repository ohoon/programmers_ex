/*
코딩 기초 트레이닝
문자열 여러 번 뒤집기
https://school.programmers.co.kr/learn/courses/30/lessons/181913
*/

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] q : queries) {
            my_string = my_string.substring(0, q[0]) +
                new StringBuilder(my_string.substring(q[0], q[1]+1)).reverse().toString() +
                my_string.substring(q[1]+1);
        }
        
        return my_string;
    }
}
