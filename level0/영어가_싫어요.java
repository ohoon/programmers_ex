/*
코딩테스트 입문
영어가 싫어요
https://school.programmers.co.kr/learn/courses/30/lessons/120894
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        Map<String, Integer> map = new HashMap<>(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        String key = "";
        for (char ch : numbers.toCharArray()) {
            key += ch;
            if (map.containsKey(key)) {
                answer = answer * 10 + map.get(key);
                key = "";
            }
        }

        return answer;
    }
}