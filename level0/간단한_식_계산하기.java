/*
코딩 기초 트레이닝
간단한 식 계산하기
https://school.programmers.co.kr/learn/courses/30/lessons/181865
*/

class Solution {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");
        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[2]);
        char op = split[1].charAt(0);
        switch (op) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
        }

        return -1;
    }
}