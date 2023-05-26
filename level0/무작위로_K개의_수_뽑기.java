/*
코딩 기초 트레이닝
무작위로 K개의 수 뽑기
https://school.programmers.co.kr/learn/courses/30/lessons/181858
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int n = arr.length, cur = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            while (cur < n && set.contains(arr[cur])) {
                cur++;
            }

            if (cur == n) {
                answer[i] = -1;
                continue;
            }

            set.add(arr[cur]);
            answer[i] = arr[cur++];
        }

        return answer;
    }
}