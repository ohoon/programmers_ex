/*
코딩 기초 트레이닝
꼬리 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/181841
*/

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (str.indexOf(ex) > -1) {
                continue;
            }

            sb.append(str);
        }

        return sb.toString();
    }
}