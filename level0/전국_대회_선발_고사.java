/*
코딩 기초 트레이닝
전국 대회 선발 고사
https://school.programmers.co.kr/learn/courses/30/lessons/181851
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0, n = rank.length;
        int[] rankIndex = new int[n+1];
        for (int i = 0; i < n; i++) {
            rankIndex[rank[i]] = i;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (answer >= 10000 || count == 3) {
                break;
            }

            if (!attendance[rankIndex[i]]) {
                continue;
            }

            answer = answer * 100 + rankIndex[i];
            count++;
        }

        return answer;
    }
}