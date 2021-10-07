/*
위클리 챌린지 9주차
전력망을 둘로 나누기
https://programmers.co.kr/learn/courses/30/lessons/86971
*/

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        boolean[][] table = new boolean[n][n];      // 각 노드 별로 어떤 노드와 연결되어 있는지 기록되는 테이블
        for (int[] w : wires) {
            table[w[0]-1][w[1]-1] = true;
            table[w[1]-1][w[0]-1] = true;
        }
        
        for (int[] w : wires) {
            int oneGroup = count(table, w[0]-1, w[1]-1);
            int otherGroup = n - oneGroup;
            answer = Math.min(answer, Math.abs(oneGroup - otherGroup));
        }
        
        return answer;
    }
    
    private int count(boolean[][] table, int current, int prev) {       // current 송신탑에서 닿을 수 있는 모든 송신탑의 개수를 반환하는 함수. prev 송신탑의 연결은 탐색에서 제외
        int result = 1;
        for (int i = 0; i < table[current].length; i++) {
            if (i == prev) {        // current와 prev의 연결이 끊겼다고 가정 (무한 순회 예방 및 문제에서 요구하는 조건에 해당)
                continue;
            }
            
            if (table[current][i]) {
                result += count(table, i, current);
            }
        }
        
        return result;
    }
}
