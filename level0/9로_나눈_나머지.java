/*
코딩 기초 트레이닝
9로 나눈 나머지
https://school.programmers.co.kr/learn/courses/30/lessons/181914
*/

class Solution {
    private int digitSum(String number) {
        int sum = 0;
        for (char ch : number.toCharArray()) {
            sum += ch - '0';
        }

        return sum;
    }

    public int solution(String number) {
        return digitSum(number) % 9;
    }
}