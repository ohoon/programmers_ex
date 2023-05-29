/*
코딩 기초 트레이닝
배열의 원소만큼 추가하기
https://school.programmers.co.kr/learn/courses/30/lessons/181861
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}