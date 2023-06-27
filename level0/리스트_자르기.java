/*
코딩 기초 트레이닝
리스트 자르기
https://school.programmers.co.kr/learn/courses/30/lessons/181897
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1]+1);
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        }

        int[] answer = new int[(int) Math.ceil((double) (slicer[1] - slicer[0] + 1) / slicer[2])];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[slicer[0]+slicer[2]*i];
        }

        return answer;
    }
}