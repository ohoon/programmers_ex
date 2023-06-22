/*
코딩 기초 트레이닝
왼쪽 오른쪽
https://school.programmers.co.kr/learn/courses/30/lessons/181890
*/

import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            }

            if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }
        }

        return new String[0];
    }
}