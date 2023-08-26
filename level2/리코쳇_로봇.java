/*
연습문제
리코쳇 로봇
https://programmers.co.kr/learn/courses/30/lessons/169199
*/

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    private int[] findRPoint(char[][] tiles) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                if (tiles[i][j] == 'R') {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private int[] move(char[][] tiles, int[] pos, int[] dir) {
        int[] res = pos.clone();
        while (true) {
            int nextY = res[0] + dir[0];
            int nextX = res[1] + dir[1];
            if (nextY < 0 ||
                    nextY == tiles.length ||
                    nextX < 0 ||
                    nextX == tiles[0].length ||
                    tiles[nextY][nextX] == 'D') {
                break;
            }

            res[0] += dir[0];
            res[1] += dir[1];
        }

        return res;
    }

    public int solution(String[] board) {
        char[][] tiles = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            tiles[i] = board[i].toCharArray();
        }

        Deque<int[]> deq = new LinkedList<>();
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int[] start = findRPoint(tiles);
        int move = 0;
        tiles[start[0]][start[1]] = 'V';
        deq.addLast(new int[]{start[0], start[1]});
        while (!deq.isEmpty()) {
            move++;
            int size = deq.size();
            for (int i = 0; i < size; i++) {
                int[] pos = deq.removeFirst();
                for (int[] dir : dirs) {
                    int[] dest = move(tiles, pos, dir);
                    if (tiles[dest[0]][dest[1]] == 'V') {
                        continue;
                    }

                    if (tiles[dest[0]][dest[1]] == 'G') {
                        return move;
                    }

                    tiles[dest[0]][dest[1]] = 'V';
                    deq.addLast(dest);
                }
            }
        }

        return -1;
    }
}