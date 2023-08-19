/*
2022 KAKAO BLIND RECRUITMENT
신고 결과 받기
https://programmers.co.kr/learn/courses/30/lessons/92334
*/

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> indexMap = new HashMap<>();
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            indexMap.put(id_list[i], i);
        }

        for (String rp : report) {
            String[] split = rp.split(" ");
            String from = split[0];
            String to = split[1];
            if (!reportMap.containsKey(to)) {
                reportMap.put(to, new HashSet<String>());
            }

            reportMap.get(to).add(from);
        }

        for (String to : reportMap.keySet()) {
            if (reportMap.get(to).size() < k) {
                continue;
            }

            for (String from : reportMap.get(to)) {
                answer[indexMap.get(from)]++;
            }
        }

        return answer;
    }
}