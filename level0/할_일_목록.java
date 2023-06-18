/*
코딩 기초 트레이닝
할 일 목록
https://school.programmers.co.kr/learn/courses/30/lessons/181885
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i]) {
                continue;
            }

            answer.add(todo_list[i]);
        }

        return answer.toArray(new String[answer.size()]);
    }
}