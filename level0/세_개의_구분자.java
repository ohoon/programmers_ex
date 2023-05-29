/*
코딩 기초 트레이닝
세 개의 구분자
https://school.programmers.co.kr/learn/courses/30/lessons/181862
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() == 0) {
                    continue;
                }

                answer.add(sb.toString());
                sb.setLength(0);
                continue;
            }

            sb.append(ch);
        }

        if (sb.length() > 0) {
            answer.add(sb.toString());
        }

        if (answer.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return answer.toArray(new String[answer.size()]);
    }
}