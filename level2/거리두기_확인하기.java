/*
2021 카카오 채용연계형 인턴십
거리두기 확인하기
https://programmers.co.kr/learn/courses/30/lessons/81302
*/

class Solution {
    private int countAround(String[] place, int i, int j) {     // 해당 좌석의 주변 사람 수를 반환하는 메서드
        int result = 0;
        if (i > 0 && place[i-1].charAt(j) == 'P') {
            result++;
        }
        
        if (j > 0 && place[i].charAt(j-1) == 'P') {
            result++;
        }
        
        if (i < 4 && place[i+1].charAt(j) == 'P') {
            result++;
        }
        
        if (j < 4 && place[i].charAt(j+1) == 'P') {
            result++;
        }
        
        return result;
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            boolean isSafe = true;
            for (int j = 0; j < 5; j++) {
                for (int l = 0; l < 5; l++) {
                    char seat = places[i][j].charAt(l);
                    if ((seat == 'P' && countAround(places[i], j, l) > 0) ||        // 해당 좌석에 사람이 있으면 주위 좌석에 사람이 있으면 안됨
                        (seat == 'O' && countAround(places[i], j, l) > 1)           // 해당 좌석이 빈 좌석이면 주위 좌석에 사람이 2명 이상 있으면 안됨
                    ) {
                        isSafe = false;
                        break;
                    }
                }
                
                if (!isSafe) {
                    break;
                }
            }
            
            if (isSafe) {
                answer[i] = 1;
            }
        }
        
        return answer;
    }
}
