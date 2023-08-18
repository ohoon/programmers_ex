/*
2022 KAKAO TECH INTERNSHIP
성격 유형 검사하기
https://programmers.co.kr/learn/courses/30/lessons/118666
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            int point = choices[i] - 4;
            if (point < 0) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.getOrDefault(ch, 0) + Math.abs(point));
            } else {
                char ch = survey[i].charAt(1);
                map.put(ch, map.getOrDefault(ch, 0) + Math.abs(point));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T');
        sb.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F');
        sb.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M');
        sb.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
        return sb.toString();
    }
}