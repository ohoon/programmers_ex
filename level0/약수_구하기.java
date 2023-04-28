/*
코딩테스트 입문
약수 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120897
*/

import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new TreeSet<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i != 0) {
                continue;
            }

            answer.add(i);
            answer.add(n/i);
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}