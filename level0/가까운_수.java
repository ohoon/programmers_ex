/*
코딩테스트 입문
가까운 수
https://school.programmers.co.kr/learn/courses/30/lessons/120890
*/

import java.util.TreeSet;

class Solution {
    public int solution(int[] array, int n) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : array) {
            set.add(num);
        }

        Integer floor = set.floor(n);
        Integer ceil = set.ceiling(n);
        if (floor == null) {
            return ceil;
        }

        if (ceil == null) {
            return floor;
        }

        return (n-floor) > (ceil-n) ? ceil : floor;
    }
}