/*
코딩테스트 연습
개인정보 수집 유효기간
https://programmers.co.kr/learn/courses/30/lessons/150370
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private int[] convert(String date) {
        return Arrays.stream(date.split("\\.")).mapToInt(v->Integer.valueOf(v)).toArray();
    }

    private int diffOfMonth(int[] from, int[] to) {
        int result = 0;
        if (from[2] > to[2]) {
            result--;
        }

        result += to[1] - from[1];
        result += (to[0] - from[0]) * 12;
        return result;
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int[] termMap = new int[26];
        for (String term : terms) {
            String[] split = term.split(" ");
            termMap[split[0].charAt(0) - 'A'] = Integer.valueOf(split[1]);
        }

        int[] todayArr = convert(today);
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            int[] dateArr = convert(split[0]);
            if (diffOfMonth(dateArr, todayArr) >= termMap[split[1].charAt(0) - 'A']) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}