/*
코딩테스트 연습
추억 점수
https://programmers.co.kr/learn/courses/30/lessons/176963
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < answer.length; i++) {
            for (String p : photo[i]) {
                answer[i] += map.getOrDefault(p, 0);
            }
        }

        return answer;
    }
}