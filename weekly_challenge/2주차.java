/*
위클리 챌린지 2주차
상호 평가
https://programmers.co.kr/learn/courses/30/lessons/83201
*/

class Solution {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        double n = scores.length;
        for (int c = 0; c < n; c++) {
            boolean isHighest = true, isLowest = true;          // 자신을 평가한 점수가 유일한 최고점인지 최저점인지 확인용
            int myPoint = scores[c][c];
            int total = 0;
            for (int r = 0; r < n; r++) {
                if (r != c) {       // 다른 사람이 나를 평가한 점수 확인
                    if (scores[r][c] >= myPoint) {      // 각 평가점수가 myPoint 이상이면 myPoint는 유일한 최고점이 아님
                        isHighest = false;
                    }

                    if (scores[r][c] <= myPoint) {      // 각 평가점수가 myPoint 이하면 myPoint는 유일한 최저점이 아님
                        isLowest = false;
                    }
                }
                
                total += scores[r][c];
            }
            
            if (isHighest || isLowest) {        // 자신을 평가한 점수를 제외해야하는 경우
                sb.append(avgToGrade((total - myPoint) / (n - 1)));
            } else {
                sb.append(avgToGrade(total / n));
            }
        }
        
        return sb.toString();
    }
    
    private String avgToGrade(double avg) {
        if (avg >= 90)
            return "A";
        
        if (avg >= 80)
            return "B";
        
        if (avg >= 70)
            return "C";
        
        if (avg >= 50)
            return "D";
        
        return "F";
    }
}
