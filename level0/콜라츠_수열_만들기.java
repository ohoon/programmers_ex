/*
코딩 기초 트레이닝
콜라츠 수열 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/181919
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            answer.add(n);
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}