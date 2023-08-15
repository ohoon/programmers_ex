/*
코딩테스트 연습
삼총사
https://programmers.co.kr/learn/courses/30/lessons/131705
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int answer = 0, n = number.length;
        Arrays.sort(number);
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int sum = number[i] + number[j];
                for (int k = j+1; k < n; k++) {
                    if (number[k] + sum == 0) {
                        answer++;
                        continue;
                    }

                    if (number[k] + sum > 0) {
                        break;
                    }
                }
            }
        }

        return answer;
    }
}