/*
코딩 기초 트레이닝
배열 만들기 6
https://school.programmers.co.kr/learn/courses/30/lessons/181859
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deq = new LinkedList<>();
        for (int num : arr) {
            if (!deq.isEmpty() && deq.peekLast() == num) {
                deq.removeLast();
                continue;
            }

            deq.addLast(num);
        }

        if (deq.isEmpty()) {
            return new int[]{-1};
        }

        return deq.stream().mapToInt(v->v).toArray();
    }
}