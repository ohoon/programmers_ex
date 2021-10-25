/*
위클리 챌린지 12주차
피로도
https://programmers.co.kr/learn/courses/30/lessons/87946
*/

class Solution {
    private int travel(int k, int[][] dungeons, boolean[] isVisit, int count) {         // 완전 탐색
        int result = count;
        for (int i = 0; i < dungeons.length; i++) {
            if (isVisit[i] || k < dungeons[i][0]) {     // 이미 방문한 던전이거나 최소 필요 피로도를 충족하지 못하면 다음 던전으로
                continue;
            }
            
            isVisit[i] = true;
            result = Math.max(result, travel(k-dungeons[i][1], dungeons, isVisit, count+1));        // 재귀적으로 방문 가능한 던전을 탐색
            isVisit[i] = false;
        }
        
        return result;
    }
    
    public int solution(int k, int[][] dungeons) {
        return travel(k, dungeons, new boolean[dungeons.length], 0);
    }
}
