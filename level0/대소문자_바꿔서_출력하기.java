/*
코딩 기초 트레이닝
대소문자 바꿔서 출력하기
https://school.programmers.co.kr/learn/courses/30/lessons/181949
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char ch : a.toCharArray()) {
            sb.append(Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
        }

        System.out.println(sb.toString());
    }
}