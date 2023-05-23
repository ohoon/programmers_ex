/*
코딩 기초 트레이닝
뒤에서 5등 위로
https://school.programmers.co.kr/learn/courses/30/lessons/181852
*/

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}