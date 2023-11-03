/*
연습문제
당구 연습
https://programmers.co.kr/learn/courses/30/lessons/169198
*/

class Solution {
    private int getDistanceSquare(double startX, double startY, double endX, double endY) {
        return (int) (Math.pow(startX - endX, 2) + Math.pow(startY - endY, 2));
    }

    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {        // 목표구의 위치를 선대칭
        int[] answer = new int[balls.length];
        for (int i = 0; i < balls.length; i++) {
            int endX = balls[i][0], endY = balls[i][1];
            answer[i] = Integer.MAX_VALUE;
            if (startX != endX || startY < endY) {
                answer[i] = Math.min(answer[i], getDistanceSquare(startX, startY, endX, -endY));
            }

            if (startX != endX || startY > endY) {
                answer[i] = Math.min(answer[i], getDistanceSquare(startX, startY, endX, 2*n - endY));
            }

            if (startY != endY || startX < endX) {
                answer[i] = Math.min(answer[i], getDistanceSquare(startX, startY, -endX, endY));
            }

            if (startY != endY || startX > endX) {
                answer[i] = Math.min(answer[i], getDistanceSquare(startX, startY, 2*m - endX, endY));
            }
        }

        return answer;
    }
}