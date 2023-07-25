/*
코딩테스트 연습
달리기 경주
https://programmers.co.kr/learn/courses/30/lessons/178871
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    private void swap(String[] arr, int m, int n) {
        String temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int cur = map.get(call);
            map.put(players[cur-1], cur);
            map.put(call, cur-1);
            swap(players, cur, cur-1);
        }

        return players;
    }
}