/*
코딩 기초 트레이닝
문자열 반복해서 출력하기
https://school.programmers.co.kr/learn/courses/30/lessons/181950
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        System.out.println(sb.toString());
    }
}