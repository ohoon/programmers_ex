/*
코딩테스트 입문
인덱스 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/120895
*/

class Solution {
    public String solution(String my_string, int num1, int num2) {
        if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        return my_string.substring(0, num1) +
                my_string.charAt(num2) +
                my_string.substring(num1+1, num2) +
                my_string.charAt(num1) + my_string.substring(num2+1);
    }
}