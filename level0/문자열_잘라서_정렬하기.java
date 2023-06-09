/*
코딩 기초 트레이닝
문자열 잘라서 정렬하기
https://school.programmers.co.kr/learn/courses/30/lessons/181866
*/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        String[] split = myString.split("x");
        for (String str : split) {
            if (str.length() == 0) {
                continue;
            }

            answer.add(str);
        }

        Collections.sort(answer);
        return answer.toArray(new String[answer.size()]);
    }
}