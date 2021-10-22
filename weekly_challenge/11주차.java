/*
위클리 챌린지 11주차
아이템 줍기
https://programmers.co.kr/learn/courses/30/lessons/87694
*/

class Solution {
    private void markEdges(boolean[][] isMarked, int[] rect) {      // 모든 모서리 부분을 마킹하는 함수
        for (int i = rect[0]; i <= rect[2]; i++) {
            isMarked[i][rect[1]] = true;
            isMarked[i][rect[3]] = true;
        }
        
        for (int i = rect[1]; i <= rect[3]; i++) {
            isMarked[rect[0]][i] = true;
            isMarked[rect[2]][i] = true;
        }
    }
    
    private void unmarkBodies(boolean[][] isMarked, int[] rect) {   // 모든 면 부분을 언마킹하는 함수
        for (int i = rect[0] + 1; i <= rect[2] - 1; i++) {
            for (int j = rect[1] + 1; j <= rect[3] - 1; j++) {
                isMarked[i][j] = false;
            }
        }
    }
    
    private int getLength(boolean[][] isMarked, int cX, int cY, int iX, int iY) {   // [cX, cY]부터 [iX, iY]까지의 최소 거리를 구하는 함수
        int l1 = 0, l2 = 0;
        int[] cur = {cX, cY};
        int[] prev = {cX, cY};      // 무한 반복을 막기 위해 이전 지점을 기억
        while (cur[0] != iX || cur[1] != iY) {      // [cX, cY]에서 [iX, iY]까지 탐색
            if (!(cur[0]+1 == prev[0] && cur[1] == prev[1]) && isMarked[cur[0]+1][cur[1]]) {        // 오른쪽 탐색
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[0]++;
            } else if (!(cur[0]-1 == prev[0] && cur[1] == prev[1]) && isMarked[cur[0]-1][cur[1]]) { // 왼쪽 탐색
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[0]--;
            } else if (!(cur[0] == prev[0] && cur[1]+1 == prev[1]) && isMarked[cur[0]][cur[1]+1]) { // 위쪽 탐색
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[1]++;
            } else if (!(cur[0] == prev[0] && cur[1]-1 == prev[1]) && isMarked[cur[0]][cur[1]-1]) { // 아래쪽 탐색
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[1]--;
            } else {    // 더 이상 갈 수 없을 때
                break;
            }
            
            l1++;
        }
        
        while (cur[0] != cX || cur[1] != cY) {      // [iX, iY]에서 [cX, cY]로 돌아오는 탐색
            if (!(cur[0]+1 == prev[0] && cur[1] == prev[1]) && isMarked[cur[0]+1][cur[1]]) {
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[0]++;
            } else if (!(cur[0]-1 == prev[0] && cur[1] == prev[1]) && isMarked[cur[0]-1][cur[1]]) {
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[0]--;
            } else if (!(cur[0] == prev[0] && cur[1]+1 == prev[1]) && isMarked[cur[0]][cur[1]+1]) {
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[1]++;
            } else if (!(cur[0] == prev[0] && cur[1]-1 == prev[1]) && isMarked[cur[0]][cur[1]-1]) {
                prev[0] = cur[0];
                prev[1] = cur[1];
                cur[1]--;
            } else {
                break;
            }
            
            l2++;
        }
        
        return Math.min(l1, l2);        // 두 길이 중에 짧은 것을 반환
    }
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        boolean[][] isMarked = new boolean[102][102];
        for (int[] rect : rectangle) {      // 점과 점 사이의 길도 마킹하기 위해서 전체적으로 2배 스케일업
            rect[0] *= 2;
            rect[1] *= 2;
            rect[2] *= 2;
            rect[3] *= 2;
        }
        
        for (int[] rect : rectangle) {          // 모든 모서리를 마킹한 후에 모든 면을 언마킹하면 겹쳐있는 모서리를 제외한 모서리만 마킹이 되어 있게 됨
            markEdges(isMarked, rect);
        }
        
        for (int[] rect : rectangle) {
            unmarkBodies(isMarked, rect);
        }

        return getLength(isMarked, characterX*2, characterY*2, itemX*2, itemY*2) / 2;
    }
}

/*
여담

모서리들을 모조리 마킹하고 면을 언마킹해서 길을 탐색하는 방법은 어렵지 않게 생각할 수 있었는데,
사각형의 너비나 높이가 한칸밖에 안되면 이 것을 그냥 이어진 길이라고 판단하게 되는 문제가 발생해서 몇몇 테스트케이스가 통과되지 않았다.
어떻게 이 점과 점 사이의 길을 표현할 수 있을까 생각을 하다가 단순하게 2배로 스케일업해서 나중에 길이를 반으로 줄이면 되지 않을까 생각이 들었다.
물론 다른 사람들이 준 힌트 때문에 생각해낼 수 있었던 것 같다.
*/
