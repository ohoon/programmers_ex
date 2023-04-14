/*
코딩테스트 입문
문자열 정렬하기 (1)
https://school.programmers.co.kr/learn/courses/30/lessons/120850
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            if (ch < '0' || ch > '9') {
                continue;
            }

            list.add(ch-'0');
        }

        return list.stream().sorted().mapToInt(v->v).toArray();
    }
}