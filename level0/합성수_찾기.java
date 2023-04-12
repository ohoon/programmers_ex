/*
코딩테스트 입문
합성수 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/120846
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        for (int i = 2; i <= (int) Math.pow(n, 0.5); i++) {
            for (int num = 2*i; num <= n; num += i) {
                set.remove(num);
            }
        }

        return n - set.size();
    }
}