/*
코딩 기초 트레이닝
배열의 원소 삭제하기
https://school.programmers.co.kr/learn/courses/30/lessons/181844
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : delete_list) {
            set.add(num);
        }

        for (int num : arr) {
            if (set.contains(num)) {
                continue;
            }

            answer.add(num);
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}