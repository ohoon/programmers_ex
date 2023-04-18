/*
코딩테스트 입문
등수 매기기
https://school.programmers.co.kr/learn/courses/30/lessons/120882
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int[] solution(int[][] score) {
        Map<Double, List<Integer>> map = new TreeMap<>((x, y) -> y.compareTo(x));
        for (int i = 0; i < score.length; i++) {
            double avg = (score[i][0] + score[i][1]) / 2.0;
            if (!map.containsKey(avg)) {
                map.put(avg, new ArrayList<>());
            }

            map.get(avg).add(i);
        }

        int[] answer = new int[score.length];
        int rank = 1;
        for (double avg : map.keySet()) {
            List<Integer> students = map.get(avg);
            for (int index : students) {
                answer[index] = rank;
            }

            rank += students.size();
        }

        return answer;
    }
}