/*
코딩 기초 트레이닝
커피 심부름
https://school.programmers.co.kr/learn/courses/30/lessons/181837
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] order) {
        Map<String, Integer> map = new HashMap<>(){{
            put("iceamericano", 4500);
            put("americanoice", 4500);
            put("hotamericano", 4500);
            put("americanohot", 4500);
            put("americano", 4500);
            put("anything", 4500);
            put("icecafelatte", 5000);
            put("cafelatteice", 5000);
            put("hotcafelatte", 5000);
            put("cafelattehot", 5000);
            put("cafelatte", 5000);
        }};

        int answer = 0;
        for (String o : order) {
            answer += map.get(o);
        }

        return answer;
    }
}