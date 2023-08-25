/*
연습문제
광물 캐기
https://programmers.co.kr/learn/courses/30/lessons/172927
*/

class Solution {
    private int calc(String pickaxe, String mineral) {
        if ("stone".equals(pickaxe) && "diamond".equals(mineral)) {
            return 25;
        }

        if ("iron".equals(pickaxe) && "diamond".equals(mineral) ||
                "stone".equals(pickaxe) && "iron".equals(mineral)) {
            return 5;
        }

        return 1;
    }

    private int work(String pickaxe, String[] minerals, int cur) {
        int res = 0;
        for (int i = cur; i < Math.min(cur+5, minerals.length); i++) {
            res += calc(pickaxe, minerals[i]);
        }

        return res;
    }

    private int dfs(int[] picks, String[] minerals, int cur, int sum) {
        if (cur >= minerals.length) {
            return sum;
        }

        int res = Integer.MAX_VALUE;
        String[] pickNames = new String[]{"diamond", "iron", "stone"};
        for (int i = 0; i < picks.length; i++) {
            if (picks[i] == 0) {
                continue;
            }

            picks[i]--;
            res = Math.min(res, dfs(picks, minerals, cur+5, sum+work(pickNames[i], minerals, cur)));
            picks[i]++;
        }

        return res == Integer.MAX_VALUE ? sum : res;
    }

    public int solution(int[] picks, String[] minerals) {
        return dfs(picks, minerals, 0, 0);
    }
}