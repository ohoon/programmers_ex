/*
코딩테스트 입문
특이한 정렬
https://school.programmers.co.kr/learn/courses/30/lessons/120880
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((x, y) ->
                        Math.abs(n-x) == Math.abs(n-y) ? y - x : Math.abs(n-x) - Math.abs(n-y))
                .mapToInt(v->v)
                .toArray();
    }
}