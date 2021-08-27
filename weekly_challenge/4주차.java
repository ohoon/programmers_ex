/*
위클리 챌린지 4주차
직업군 추천하기
https://programmers.co.kr/learn/courses/30/lessons/84325
*/

import java.util.*;

class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        Arrays.sort(table);     // 직업군 이름 사전 순으로 정렬
        
        int[] result = new int[5];          // 직업군 언어 점수 배열
        String[] part = new String[5];      // 직업군 이름 배열
        String[][] tb = new String[5][5];   // 직업군 언어 등급 배열
        for (int i = 0; i < table.length; i++) {
            String[] split = table[i].split(" ");
            part[i] = split[0];
            for (int j = 0; j < 5; j++) {   // table을 split하여 part와 tb 값 대입
                tb[i][j] = split[j+1];
            }
        }
        
        for (int i = 0; i < languages.length; i++) {        // 각 언어마다 직업군 언어 등급을 참고하여 각각의 직업군에 따라 언어 점수 계산
            for (int j = 0; j < tb.length; j++) {
                for (int k = 0; k < tb[0].length; k++) {
                    if (tb[j][k].equals(languages[i])) {
                        result[j] += (5 - k) * preference[i];
                        break;
                    }
                }
            }
        }
        
        int best = 0;
        for (int i = 1; i < result.length; i++) {       // result에서 가장 큰 언어 점수가 나온 직업군이 최적 직업군
            if (result[i] > result[best]) {
                best = i;
            }
        }
        
        return part[best];
    }
}
