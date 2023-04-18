/*
코딩테스트 입문
로그인 성공?
https://school.programmers.co.kr/learn/courses/30/lessons/120883
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<>();
        for (String[] member : db) {
            String id = member[0];
            String pw = member[1];
            map.put(id, pw);
        }

        if (!map.containsKey(id_pw[0])) {
            return "fail";
        }

        return map.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw";
    }
}