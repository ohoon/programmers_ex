/*
코딩 기초 트레이닝
공백으로 구분하기 2
https://school.programmers.co.kr/learn/courses/30/lessons/181868
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] split = my_string.split(" ");
        for (String str : split) {
            if (str.length() == 0) {
                continue;
            }

            answer.add(str);
        }

        return answer.toArray(new String[answer.size()]);
    }
}