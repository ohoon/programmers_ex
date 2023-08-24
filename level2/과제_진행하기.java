/*
연습문제
과제 진행하기
https://programmers.co.kr/learn/courses/30/lessons/176962
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    private int toMinute(String time) {
        String[] split = time.split(":");
        return Integer.valueOf(split[0]) * 60 + Integer.valueOf(split[1]);
    }

    public String[] solution(String[][] plans) {
        int[][] arr = new int[plans.length][3];
        for (int i = 0; i < plans.length; i++) {
            arr[i] = new int[]{i, toMinute(plans[i][1]), Integer.valueOf(plans[i][2])};
        }

        Arrays.sort(arr, (x, y) -> x[1] - y[1]);
        List<String> answer = new ArrayList<>();
        Deque<Integer> deq = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int time = (i == arr.length-1 ? Integer.MAX_VALUE : arr[i+1][1] - arr[i][1]);
            if (time < arr[i][2]) {
                arr[i][2] -= time;
                deq.addLast(i);
                continue;
            }

            time -= arr[i][2];
            answer.add(plans[arr[i][0]][0]);
            while (time > 0 && !deq.isEmpty()) {
                int index = deq.removeLast();
                if (time < arr[index][2]) {
                    arr[index][2] -= time;
                    deq.addLast(index);
                    break;
                }

                time -= arr[index][2];
                answer.add(plans[arr[index][0]][0]);
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}