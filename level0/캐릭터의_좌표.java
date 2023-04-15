/*
코딩테스트 입문
캐릭터의 좌표
https://school.programmers.co.kr/learn/courses/30/lessons/120861
*/

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = board[0], height = board[1];
        for (String input : keyinput) {
            switch (input) {
                case "up":
                    answer[1] = Math.min(answer[1] + 1, height / 2);
                    break;
                case "down":
                    answer[1] = Math.max(answer[1] - 1, -height / 2);
                    break;
                case "left":
                    answer[0] = Math.max(answer[0] - 1, -width / 2);
                    break;
                case "right":
                    answer[0] = Math.min(answer[0] + 1, width / 2);
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}