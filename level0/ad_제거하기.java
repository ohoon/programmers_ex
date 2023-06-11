/*
코딩 기초 트레이닝
ad 제거하기
https://school.programmers.co.kr/learn/courses/30/lessons/181870
*/

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(x -> !x.contains("ad")).toArray(String[]::new);
    }
}