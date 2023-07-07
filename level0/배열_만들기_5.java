/*
코딩 기초 트레이닝
배열 만들기 5
https://school.programmers.co.kr/learn/courses/30/lessons/181912
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String intStr : intStrs) {
            int val = Integer.valueOf(intStr.substring(s, s+l));
            if (val > k) {
                answer.add(val);
            }
        }
        
        return answer.stream().mapToInt(v->v).toArray();
    }
}
