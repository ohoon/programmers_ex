/*
코딩테스트 입문
소인수분해
https://school.programmers.co.kr/learn/courses/30/lessons/120852
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<>();
        int factor = 2;
        while (n > 1) {
            if (n % factor > 0) {
                factor++;
                continue;
            }

            answer.add(factor);
            n /= factor;
        }

        return answer.stream().sorted().mapToInt(v->v).toArray();
    }
}