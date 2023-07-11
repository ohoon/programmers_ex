/*
코딩 기초 트레이닝
배열 만들기 2
https://school.programmers.co.kr/learn/courses/30/lessons/181921
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int num = 5;
        while (num <= r) {
            List<Integer> next = new ArrayList<>();
            next.add(num);
            for (int prev : list) {
                if (num + prev > r) {
                    break;
                }

                next.add(num + prev);
            }

            list.addAll(next);
            num *= 10;
        }

        int[] answer = list.stream().filter(v -> v >= l && v <= r).mapToInt(v -> v).toArray();
        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}