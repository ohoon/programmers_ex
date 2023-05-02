/*
코딩테스트 입문
n의 배수 고르기
https://school.programmers.co.kr/learn/courses/30/lessons/120905
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int num : numlist) {
            if (num % n > 0) {
                continue;
            }

            answer.add(num);
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}