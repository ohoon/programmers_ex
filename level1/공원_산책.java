/*
코딩테스트 연습
공원 산책
https://programmers.co.kr/learn/courses/30/lessons/172928
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    private int[] findStartPoint(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'S') {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = findStartPoint(park);
        Map<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{-1, 0});
        map.put('S', new int[]{1, 0});
        map.put('W', new int[]{0, -1});
        map.put('E', new int[]{0, 1});
        for (String r : routes) {
            char dir = r.charAt(0);
            int move = r.charAt(2) - '0';
            boolean isMovable = true;
            for (int i = 1; i <= move; i++) {
                int y = answer[0] + map.get(dir)[0] * i;
                int x = answer[1] + map.get(dir)[1] * i;
                if (y < 0 || y >= park.length || x < 0 || x >= park[0].length() || park[y].charAt(x) == 'X') {
                    isMovable = false;
                    break;
                }
            }

            if (isMovable) {
                answer[0] += map.get(dir)[0] * move;
                answer[1] += map.get(dir)[1] * move;
            }
        }

        return answer;
    }
}