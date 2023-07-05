/*
코딩 기초 트레이닝
접미사 배열
https://school.programmers.co.kr/learn/courses/30/lessons/181909
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.length() > 0) {
            answer.add(sb.toString());
            sb.deleteCharAt(0);
        }

        return answer.stream().sorted().toArray(String[]::new);
    }
}