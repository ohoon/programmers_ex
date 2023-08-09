/*
코딩테스트 연습
햄버거 만들기
https://programmers.co.kr/learn/courses/30/lessons/133502
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    private boolean isBurger(Deque<Integer> deq) {      // hardcoding적인 접근법 개선 필요
        if (deq.size() < 4) {
            return false;
        }

        if (deq.peekLast() != 1) {
            return false;
        }

        int first = deq.removeLast();
        if (deq.peekLast() != 3) {
            deq.addLast(first);
            return false;
        }

        int second = deq.removeLast();
        if (deq.peekLast() != 2) {
            deq.addLast(second);
            deq.addLast(first);
            return false;
        }

        int third = deq.removeLast();
        if (deq.peekLast() != 1) {
            deq.addLast(third);
            deq.addLast(second);
            deq.addLast(first);
            return false;
        }

        deq.removeLast();
        return true;
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        Deque<Integer> deq = new LinkedList<>();
        for (int ingr : ingredient) {
            deq.addLast(ingr);
            if (isBurger(deq)) {
                answer++;
            }
        }

        return answer;
    }
}