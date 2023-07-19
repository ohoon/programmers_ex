/*
코딩 기초 트레이닝
홀짝 구분하기
https://school.programmers.co.kr/learn/courses/30/lessons/181944
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
