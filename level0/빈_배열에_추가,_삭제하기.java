/*
코딩 기초 트레이닝
빈 배열에 추가, 삭제하기
https://school.programmers.co.kr/learn/courses/30/lessons/181860
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> deq = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    deq.addLast(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    deq.removeLast();
                }
            }
        }

        return deq.stream().mapToInt(v->v).toArray();
    }
}