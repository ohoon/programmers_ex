/*
코딩 기초 트레이닝
배열 만들기 4
https://school.programmers.co.kr/learn/courses/30/lessons/181918
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new LinkedList<>();
        for (int num : arr) {
            while (!stk.isEmpty() && stk.peekLast() >= num) {
                stk.removeLast();
            }

            if (stk.isEmpty() || stk.peekLast() < num) {
                stk.addLast(num);
            }
        }

        return stk.stream().mapToInt(v->v).toArray();
    }
}