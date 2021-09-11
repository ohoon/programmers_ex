/*
위클리 챌린지 6주차
복서 정렬하기
https://programmers.co.kr/learn/courses/30/lessons/85002
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int n = weights.length;
        Integer[] answer = new Integer[n];
        Double[] ratio = new Double[n];         // 승률
        int[] specialWin = new int[n];          // 자신보다 몸무게가 높은 복서를 이긴 횟수
        for (int i = 0; i < n; i++) {
            answer[i] = i+1;
            int win = 0, total = 0;
            for (int j = 0; j < head2head[i].length(); j++) {
                if (i == j) {                   // 자기 자신은 연산에서 제외
                    continue;
                }
                
                if (head2head[i].charAt(j) != 'N') {        // 총 시합 횟수 누적
                    total++;
                }
                
                if (head2head[i].charAt(j) == 'W') {        // 승리했다면 specialWin과 win 누적
                    if (weights[i] < weights[j]) {
                        specialWin[i]++;
                    }

                    win++;
                }
            }
            
            ratio[i] = total > 0 ? Double.valueOf(win) / total : 0;     // 승률 계산
        }
        
        Arrays.sort(answer, (x, y) -> {                                 // comparator을 람다식으로 구현하여 answer 정렬
            int i = x-1, j = y-1;
            if (!ratio[i].equals(ratio[j])) {                           // 승률이 같지 않으면 높은 순서대로 정렬
                return ratio[j].compareTo(ratio[i]);
            }
            
            if (specialWin[i] != specialWin[j]) {                       // specialWin이 같지 않으면 높은 순서대로 정렬
                return specialWin[j] - specialWin[i];
            }
            
            if (weights[i] != weights[j]) {                             // 몸무게가 같지 않으면 높은 순서대로 정렬
                return weights[j] - weights[i];
            }
            
            return i - j;                                               // 복서 번호 오름차순으로 정렬
        });
        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();     // Wrapper class를 primitive하게 mapping하여 반환
    }
}
