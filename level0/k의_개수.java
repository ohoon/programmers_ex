/*
코딩테스트 입문
k의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120887
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    private int dfs(int n, int k, Map<Integer, Integer> map) {
        if (n == 0) {
            return 0;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int res = ((n%10 == k) ? 1 : 0) + dfs(n/10, k, map);
        map.put(n, res);
        return res;
    }
    public int solution(int i, int j, int k) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num = i; num <= j; num++) {
            answer += dfs(num, k, map);
        }

        return answer;
    }
}