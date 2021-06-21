/*
2017 카카오코드 본선
단체사진 찍기
https://programmers.co.kr/learn/courses/30/lessons/1835
*/

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = {0, 0};
        int[][] pic = new int[m][n];            // picture의 복사본
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pic[i][j] = picture[i][j];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pic[i][j] > 0) {            // 어떠한 영역을 방문한 경우
                    answer[0]++;                // 영역 개수 증가
                    answer[1] = Math.max(answer[1], travel(i, j, pic, pic[i][j]));      // 최대 영역값 갱신
                }
            }
        }
        return answer;
    }
    
    public int travel(int r, int c, int[][] pic, int prev) {                // prev에 해당하는 영역이 총 몇 칸으로 이루어져 있는지 깊이 우선 탐색
        if (r < 0 || r >= pic.length || c < 0 || c >= pic[0].length || pic[r][c] != prev) {     // 배열 범위를 벗어나거나 prev가 아닌 다른 색 칸일 경우 0 반환
            return 0;
        }
        
        pic[r][c] = 0;          // 방문한 칸은 0으로 표시
        return travel(r-1, c, pic, prev) +      // 현재 칸 주위의 4칸을 깊이 우선 탐색하여 총 칸의 개수 반환
            travel(r+1, c, pic, prev) +
            travel(r, c-1, pic, prev) +
            travel(r, c+1, pic, prev) + 1;
    }
}
