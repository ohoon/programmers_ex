/*
코딩테스트 입문
진료 순서 정하기
https://school.programmers.co.kr/learn/courses/30/lessons/120835
*/

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new TreeMap<>((x, y) -> y - x);
        for (int em : emergency) {
            map.put(em, 0);
        }

        int order = 1;
        for (int em : map.keySet()) {
            map.put(em, order++);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}