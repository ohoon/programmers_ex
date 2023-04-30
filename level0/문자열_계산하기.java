/*
코딩테스트 입문
문자열 계산하기
https://school.programmers.co.kr/learn/courses/30/lessons/120902
*/

class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split(" ");
        int answer = Integer.valueOf(split[0]);
        for (int i = 1; i < split.length; i += 2) {
            int num = Integer.valueOf(split[i+1]);
            char op = split[i].charAt(0);
            if (op == '+') {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }
}