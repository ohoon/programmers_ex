/*
코딩 기초 트레이닝
문자열 돌리기
https://school.programmers.co.kr/learn/courses/30/lessons/181945
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch : a.toCharArray()) {
            System.out.println(ch);
        }
    }
}