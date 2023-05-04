/*
코딩테스트 입문
OX퀴즈
https://school.programmers.co.kr/learn/courses/30/lessons/120907
*/

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = Integer.valueOf(split[0]);
            int y = Integer.valueOf(split[2]);
            int z = Integer.valueOf(split[4]);
            char op = split[1].charAt(0);
            if ((op == '+' ? x+y : x-y) == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}