/*
코딩테스트 입문
최빈값 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120812
*/

class Solution {
    public int solution(int[] array) {
        int answer = -1, maxFreq = 0;
        int[] freq = new int[1001];
        boolean isMultiple = false;
        for (int num : array) {
            freq[num]++;
            if (freq[num] > maxFreq) {
                answer = num;
                maxFreq = freq[num];
                isMultiple = false;
                continue;
            }

            if (freq[num] == maxFreq) {
                isMultiple = true;
            }
        }

        return isMultiple ? -1 : answer;
    }
}