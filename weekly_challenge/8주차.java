/*
위클리 챌린지 8주차
최소직사각형
https://programmers.co.kr/learn/courses/30/lessons/86491
*/

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] answer = {sizes[0][0], sizes[0][1]};
        for (int[] size : sizes) {
            if (size[0] <= answer[0] && size[1] <= answer[1]) {     // 가로, 세로 길이 모두 answer보다 작으면 생략
                continue;
            }
            
            int[] diff = {Math.max(size[0] - answer[0], 0) + Math.max(size[1] - answer[1], 0),          // 정방향으로 명함을 집어넣었을 때 answer과의 가로 세로 길이 차이의 합
                          Math.max(size[1] - answer[0], 0) + Math.max(size[0] - answer[1], 0)};         // 90도 회전한 명함의 경우 ...
            if (diff[0] < diff[1]) {                        // 정방향이 더 효율적일 때
                int x = Math.max(size[0], answer[0]);
                int y = Math.max(size[1], answer[1]);
                answer[0] = x;
                answer[1] = y;
            } else {                                        // 90도 회전한 것이 더 효율적일 때
                int x = Math.max(size[1], answer[0]);
                int y = Math.max(size[0], answer[1]);
                answer[0] = x;
                answer[1] = y;
            }
        }
        
        return answer[0] * answer[1];
    }
}
