/*
코딩테스트 입문
컨트롤 제트
https://school.programmers.co.kr/learn/courses/30/lessons/120853
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        Deque<Integer> deq = new LinkedList<>();
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                deq.removeLast();
                continue;
            }

            deq.addLast(Integer.valueOf(str));
        }

        return deq.stream().mapToInt(v->v).sum();
    }
}